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
import m.g3;
import w7.a8;
public abstract class d {
    public static final a0.k f14088a = new a0.k(2);
    public static final a4.e f14089b = new a4.e(14);

    public static j4.f a(Context context, List list) {
        a8.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                e eVar = (e) list.get(i10);
                ProviderInfo b10 = b(context.getPackageManager(), eVar, context.getResources());
                if (b10 == null) {
                    return new j4.f();
                }
                arrayList.add(c(context, eVar, b10.authority));
            }
            return new j4.f(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, e eVar, Resources resources) {
        a4.e eVar2 = f14089b;
        a0.k kVar = f14088a;
        a8.a("FontProvider.getProvider");
        try {
            List list = eVar.d;
            String str = eVar.f14090a;
            String str2 = eVar.f14091b;
            if (list == null) {
                list = h0.b.h(resources, 0);
            }
            ?? obj = new Object();
            obj.f14085a = str;
            obj.f14086b = str2;
            obj.f14087c = list;
            ProviderInfo providerInfo = (ProviderInfo) kVar.a(obj);
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
                    Collections.sort(arrayList, eVar2);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i10));
                        Collections.sort(arrayList2, eVar2);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i11), (byte[]) arrayList2.get(i11))) {
                                    break;
                                }
                            }
                            kVar.b(obj, resolveContentProvider);
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

    public static i[] c(Context context, e eVar, String str) {
        g3 g3Var;
        int i10;
        int i11;
        ArrayList arrayList;
        Uri withAppendedId;
        int i12;
        boolean z10;
        a8.a("FontProvider.query");
        try {
            ArrayList arrayList2 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                g3Var = new g3(context, build);
            } else {
                ?? obj = new Object();
                obj.f14084a = context.getContentResolver().acquireUnstableContentProviderClient(build);
                g3Var = obj;
            }
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            a8.a("ContentQueryWrapper.query");
            try {
                Cursor n10 = g3Var.n(build, strArr, new String[]{eVar.f14092c});
                Trace.endSection();
                if (n10 != null && n10.getCount() > 0) {
                    int columnIndex = n10.getColumnIndex("result_code");
                    ArrayList arrayList3 = new ArrayList();
                    int columnIndex2 = n10.getColumnIndex("_id");
                    int columnIndex3 = n10.getColumnIndex("file_id");
                    int columnIndex4 = n10.getColumnIndex("font_ttc_index");
                    int columnIndex5 = n10.getColumnIndex("font_weight");
                    int columnIndex6 = n10.getColumnIndex("font_italic");
                    while (n10.moveToNext()) {
                        if (columnIndex != -1) {
                            i10 = n10.getInt(columnIndex);
                        } else {
                            i10 = 0;
                        }
                        if (columnIndex4 != -1) {
                            i11 = n10.getInt(columnIndex4);
                        } else {
                            i11 = 0;
                        }
                        if (columnIndex3 == -1) {
                            arrayList = arrayList3;
                            withAppendedId = ContentUris.withAppendedId(build, n10.getLong(columnIndex2));
                        } else {
                            arrayList = arrayList3;
                            withAppendedId = ContentUris.withAppendedId(build2, n10.getLong(columnIndex3));
                        }
                        Uri uri = withAppendedId;
                        if (columnIndex5 != -1) {
                            i12 = n10.getInt(columnIndex5);
                        } else {
                            i12 = 400;
                        }
                        if (columnIndex6 != -1 && n10.getInt(columnIndex6) == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ArrayList arrayList4 = arrayList;
                        arrayList4.add(new i(uri, i11, i12, z10, i10));
                        arrayList3 = arrayList4;
                    }
                    arrayList2 = arrayList3;
                }
                if (n10 != null) {
                    n10.close();
                }
                g3Var.close();
                return (i[]) arrayList2.toArray(new i[0]);
            } finally {
            }
        } finally {
        }
    }
}
