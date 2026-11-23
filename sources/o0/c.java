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
import c8.ke;
import h9.g1;
import hi.t5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import jg.w;
public abstract class c {
    public static final a0.j f21589a = new a0.j(2);
    public static final w f21590b = new w(8);

    public static m4.f a(Context context, List list) {
        ke.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < list.size(); i7++) {
                d dVar = (d) list.get(i7);
                ProviderInfo b10 = b(context.getPackageManager(), dVar, context.getResources());
                if (b10 == null) {
                    return new m4.f();
                }
                arrayList.add(c(context, dVar, b10.authority));
            }
            return new m4.f(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        w wVar = f21590b;
        a0.j jVar = f21589a;
        ke.a("FontProvider.getProvider");
        try {
            List list = dVar.d;
            String str = dVar.f21591a;
            String str2 = dVar.f21592b;
            if (list == null) {
                list = h0.b.h(resources, 0);
            }
            ?? obj = new Object();
            obj.f21586a = str;
            obj.f21587b = str2;
            obj.f21588c = list;
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
                    Collections.sort(arrayList, wVar);
                    for (int i7 = 0; i7 < list.size(); i7++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i7));
                        Collections.sort(arrayList2, wVar);
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

    public static h[] c(Context context, d dVar, String str) {
        a g1Var;
        int i7;
        int i10;
        Uri withAppendedId;
        int i11;
        boolean z10;
        ke.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                g1Var = new t5(context, build);
            } else {
                g1Var = new g1(context, build);
            }
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            ke.a("ContentQueryWrapper.query");
            Cursor c10 = g1Var.c(build, strArr, new String[]{dVar.f21593c});
            Trace.endSection();
            if (c10 != null && c10.getCount() > 0) {
                int columnIndex = c10.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = c10.getColumnIndex("_id");
                int columnIndex3 = c10.getColumnIndex("file_id");
                int columnIndex4 = c10.getColumnIndex("font_ttc_index");
                int columnIndex5 = c10.getColumnIndex("font_weight");
                int columnIndex6 = c10.getColumnIndex("font_italic");
                while (c10.moveToNext()) {
                    if (columnIndex != -1) {
                        i7 = c10.getInt(columnIndex);
                    } else {
                        i7 = 0;
                    }
                    if (columnIndex4 != -1) {
                        i10 = c10.getInt(columnIndex4);
                    } else {
                        i10 = 0;
                    }
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, c10.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, c10.getLong(columnIndex3));
                    }
                    Uri uri = withAppendedId;
                    if (columnIndex5 != -1) {
                        i11 = c10.getInt(columnIndex5);
                    } else {
                        i11 = 400;
                    }
                    if (columnIndex6 != -1 && c10.getInt(columnIndex6) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList2.add(new h(uri, i10, i11, z10, i7));
                }
                arrayList = arrayList2;
            }
            if (c10 != null) {
                c10.close();
            }
            g1Var.close();
            return (h[]) arrayList.toArray(new h[0]);
        } finally {
            Trace.endSection();
        }
    }
}
