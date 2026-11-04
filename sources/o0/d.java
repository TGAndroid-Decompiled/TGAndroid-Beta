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
import gi.v5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import x7.e6;
public abstract class d {
    public static final a0.j f20479a = new a0.j(2);
    public static final a f20480b = new a(0);

    public static l4.f a(Context context, List list) {
        e6.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                e eVar = (e) list.get(i3);
                ProviderInfo b10 = b(context.getPackageManager(), eVar, context.getResources());
                if (b10 == null) {
                    return new l4.f();
                }
                arrayList.add(c(context, eVar, b10.authority));
            }
            return new l4.f(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, e eVar, Resources resources) {
        a aVar = f20480b;
        a0.j jVar = f20479a;
        e6.a("FontProvider.getProvider");
        try {
            List list = eVar.d;
            String str = eVar.f20481a;
            String str2 = eVar.f20482b;
            if (list == null) {
                list = h0.b.h(resources, 0);
            }
            ?? obj = new Object();
            obj.f20476a = str;
            obj.f20477b = str2;
            obj.f20478c = list;
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
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i3));
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

    public static i[] c(Context context, e eVar, String str) {
        b dVar;
        int i3;
        int i10;
        Uri withAppendedId;
        int i11;
        boolean z10;
        e6.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                dVar = new v5(context, build);
            } else {
                dVar = new hi.d(context, build);
            }
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            e6.a("ContentQueryWrapper.query");
            Cursor T0 = dVar.T0(build, strArr, new String[]{eVar.f20483c});
            Trace.endSection();
            if (T0 != null && T0.getCount() > 0) {
                int columnIndex = T0.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = T0.getColumnIndex("_id");
                int columnIndex3 = T0.getColumnIndex("file_id");
                int columnIndex4 = T0.getColumnIndex("font_ttc_index");
                int columnIndex5 = T0.getColumnIndex("font_weight");
                int columnIndex6 = T0.getColumnIndex("font_italic");
                while (T0.moveToNext()) {
                    if (columnIndex != -1) {
                        i3 = T0.getInt(columnIndex);
                    } else {
                        i3 = 0;
                    }
                    if (columnIndex4 != -1) {
                        i10 = T0.getInt(columnIndex4);
                    } else {
                        i10 = 0;
                    }
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, T0.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, T0.getLong(columnIndex3));
                    }
                    Uri uri = withAppendedId;
                    if (columnIndex5 != -1) {
                        i11 = T0.getInt(columnIndex5);
                    } else {
                        i11 = 400;
                    }
                    if (columnIndex6 != -1 && T0.getInt(columnIndex6) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList2.add(new i(uri, i10, i11, z10, i3));
                }
                arrayList = arrayList2;
            }
            if (T0 != null) {
                T0.close();
            }
            dVar.close();
            return (i[]) arrayList.toArray(new i[0]);
        } finally {
            Trace.endSection();
        }
    }
}
