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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import w7.b0;
public abstract class c {
    public static final a0.j f18923a = new a0.j(2);
    public static final a4.d f18924b = new a4.d(28);

    public static j4.f a(Context context, List list) {
        b0.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                d dVar = (d) list.get(i10);
                ProviderInfo b10 = b(context.getPackageManager(), dVar, context.getResources());
                if (b10 == null) {
                    return new j4.f();
                }
                arrayList.add(c(context, dVar, b10.authority));
            }
            return new j4.f(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        a4.d dVar2 = f18924b;
        a0.j jVar = f18923a;
        b0.a("FontProvider.getProvider");
        try {
            List list = dVar.d;
            String str = dVar.f18925a;
            String str2 = dVar.f18926b;
            if (list == null) {
                list = h0.b.h(resources, 0);
            }
            ?? obj = new Object();
            obj.f18920a = str;
            obj.f18921b = str2;
            obj.f18922c = list;
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
                    Collections.sort(arrayList, dVar2);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i10));
                        Collections.sort(arrayList2, dVar2);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i11), (byte[]) arrayList2.get(i11))) {
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

    public static h[] c(Context context, d dVar, String str) {
        jg.i iVar;
        int i10;
        int i11;
        ArrayList arrayList;
        Uri withAppendedId;
        int i12;
        boolean z10;
        b0.a("FontProvider.query");
        try {
            ArrayList arrayList2 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                ?? obj = new Object();
                obj.f17284a = context.getContentResolver().acquireUnstableContentProviderClient(build);
                iVar = obj;
            } else {
                iVar = new jg.i(context, build);
            }
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            b0.a("ContentQueryWrapper.query");
            Cursor D = iVar.D(build, strArr, new String[]{dVar.f18927c});
            Trace.endSection();
            if (D != null && D.getCount() > 0) {
                int columnIndex = D.getColumnIndex("result_code");
                ArrayList arrayList3 = new ArrayList();
                int columnIndex2 = D.getColumnIndex("_id");
                int columnIndex3 = D.getColumnIndex("file_id");
                int columnIndex4 = D.getColumnIndex("font_ttc_index");
                int columnIndex5 = D.getColumnIndex("font_weight");
                int columnIndex6 = D.getColumnIndex("font_italic");
                while (D.moveToNext()) {
                    if (columnIndex != -1) {
                        i10 = D.getInt(columnIndex);
                    } else {
                        i10 = 0;
                    }
                    if (columnIndex4 != -1) {
                        i11 = D.getInt(columnIndex4);
                    } else {
                        i11 = 0;
                    }
                    if (columnIndex3 == -1) {
                        arrayList = arrayList3;
                        withAppendedId = ContentUris.withAppendedId(build, D.getLong(columnIndex2));
                    } else {
                        arrayList = arrayList3;
                        withAppendedId = ContentUris.withAppendedId(build2, D.getLong(columnIndex3));
                    }
                    Uri uri = withAppendedId;
                    if (columnIndex5 != -1) {
                        i12 = D.getInt(columnIndex5);
                    } else {
                        i12 = 400;
                    }
                    int i13 = i12;
                    if (columnIndex6 != -1 && D.getInt(columnIndex6) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ArrayList arrayList4 = arrayList;
                    arrayList4.add(new h(uri, i11, i13, z10, i10));
                    arrayList3 = arrayList4;
                }
                arrayList2 = arrayList3;
            }
            if (D != null) {
                D.close();
            }
            iVar.close();
            return (h[]) arrayList2.toArray(new h[0]);
        } finally {
            Trace.endSection();
        }
    }
}
