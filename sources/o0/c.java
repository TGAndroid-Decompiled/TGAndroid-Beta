package o0;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import f7.r8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import n2.p;
import n5.a0;
public abstract class c {
    public static final a0.j f18748a = new a0.j(2);
    public static final j9.a f18749b = new j9.a(4);

    public static h a(Context context, List list) {
        r8.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < list.size(); i9++) {
                d dVar = (d) list.get(i9);
                ProviderInfo b10 = b(context.getPackageManager(), dVar, context.getResources());
                if (b10 == null) {
                    return new h();
                }
                arrayList.add(c(context, dVar, b10.authority));
            }
            return new h(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        j9.a aVar = f18749b;
        a0.j jVar = f18748a;
        r8.a("FontProvider.getProvider");
        try {
            List list = dVar.d;
            String str = dVar.f18750a;
            String str2 = dVar.f18751b;
            if (list == null) {
                list = h0.b.h(resources, 0);
            }
            ?? obj = new Object();
            obj.f18745a = str;
            obj.f18746b = str2;
            obj.f18747c = list;
            ProviderInfo providerInfo = (ProviderInfo) jVar.a(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider != null) {
                if (resolveContentProvider.packageName.equals(str2)) {
                    Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        arrayList.add(signature.toByteArray());
                    }
                    Collections.sort(arrayList, aVar);
                    for (int i9 = 0; i9 < list.size(); i9++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i9));
                        Collections.sort(arrayList2, aVar);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i10), (byte[]) arrayList2.get(i10))) {
                                    break;
                                }
                            }
                            jVar.b(obj, resolveContentProvider);
                            return resolveContentProvider;
                        }
                    }
                    Trace.endSection();
                    return null;
                }
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        } finally {
            Trace.endSection();
        }
    }

    public static i[] c(Context context, d dVar, String str) {
        a a0Var;
        int i9;
        int i10;
        Uri withAppendedId;
        int i11;
        boolean z10;
        r8.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                a0Var = new p(context, build);
            } else {
                a0Var = new a0(context, build);
            }
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            r8.a("ContentQueryWrapper.query");
            Cursor s10 = a0Var.s(build, strArr, new String[]{dVar.f18752c});
            Trace.endSection();
            if (s10 != null && s10.getCount() > 0) {
                int columnIndex = s10.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = s10.getColumnIndex("_id");
                int columnIndex3 = s10.getColumnIndex("file_id");
                int columnIndex4 = s10.getColumnIndex("font_ttc_index");
                int columnIndex5 = s10.getColumnIndex("font_weight");
                int columnIndex6 = s10.getColumnIndex("font_italic");
                while (s10.moveToNext()) {
                    if (columnIndex != -1) {
                        i9 = s10.getInt(columnIndex);
                    } else {
                        i9 = 0;
                    }
                    if (columnIndex4 != -1) {
                        i10 = s10.getInt(columnIndex4);
                    } else {
                        i10 = 0;
                    }
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, s10.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, s10.getLong(columnIndex3));
                    }
                    Uri uri = withAppendedId;
                    if (columnIndex5 != -1) {
                        i11 = s10.getInt(columnIndex5);
                    } else {
                        i11 = 400;
                    }
                    if (columnIndex6 != -1 && s10.getInt(columnIndex6) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList2.add(new i(uri, i10, i11, z10, i9));
                }
                arrayList = arrayList2;
            }
            if (s10 != null) {
                s10.close();
            }
            a0Var.close();
            return (i[]) arrayList.toArray(new i[0]);
        } finally {
            Trace.endSection();
        }
    }
}
