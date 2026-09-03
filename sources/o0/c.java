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
import j7.j8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import nh.e4;
public abstract class c {
    public static final a0.j f16131a = new a0.j(2);
    public static final e4 f16132b = new e4(2);

    public static b4.f a(Context context, List list) {
        j8.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                d dVar = (d) list.get(i10);
                ProviderInfo b10 = b(context.getPackageManager(), dVar, context.getResources());
                if (b10 == null) {
                    return new b4.f();
                }
                arrayList.add(c(context, dVar, b10.authority));
            }
            return new b4.f(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        e4 e4Var = f16132b;
        a0.j jVar = f16131a;
        j8.a("FontProvider.getProvider");
        try {
            List list = dVar.d;
            String str = dVar.f16133a;
            String str2 = dVar.f16134b;
            if (list == null) {
                list = h0.b.h(resources, 0);
            }
            ?? obj = new Object();
            obj.f16128a = str;
            obj.f16129b = str2;
            obj.f16130c = list;
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
                    Collections.sort(arrayList, e4Var);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i10));
                        Collections.sort(arrayList2, e4Var);
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

    public static i[] c(Context context, d dVar, String str) {
        a iVar;
        int i10;
        int i11;
        Uri withAppendedId;
        int i12;
        boolean z4;
        j8.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                iVar = new ja.c(context, build);
            } else {
                iVar = new o5.i(context, build);
            }
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            j8.a("ContentQueryWrapper.query");
            Cursor b10 = iVar.b(build, strArr, new String[]{dVar.f16135c});
            Trace.endSection();
            if (b10 != null && b10.getCount() > 0) {
                int columnIndex = b10.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = b10.getColumnIndex("_id");
                int columnIndex3 = b10.getColumnIndex("file_id");
                int columnIndex4 = b10.getColumnIndex("font_ttc_index");
                int columnIndex5 = b10.getColumnIndex("font_weight");
                int columnIndex6 = b10.getColumnIndex("font_italic");
                while (b10.moveToNext()) {
                    if (columnIndex != -1) {
                        i10 = b10.getInt(columnIndex);
                    } else {
                        i10 = 0;
                    }
                    if (columnIndex4 != -1) {
                        i11 = b10.getInt(columnIndex4);
                    } else {
                        i11 = 0;
                    }
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, b10.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, b10.getLong(columnIndex3));
                    }
                    Uri uri = withAppendedId;
                    if (columnIndex5 != -1) {
                        i12 = b10.getInt(columnIndex5);
                    } else {
                        i12 = 400;
                    }
                    if (columnIndex6 != -1 && b10.getInt(columnIndex6) == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    arrayList2.add(new i(uri, i11, i12, z4, i10));
                }
                arrayList = arrayList2;
            }
            if (b10 != null) {
                b10.close();
            }
            iVar.close();
            return (i[]) arrayList.toArray(new i[0]);
        } finally {
            Trace.endSection();
        }
    }
}
