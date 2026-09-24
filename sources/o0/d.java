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
import w7.a8;
public abstract class d {
    public static final a0.k f15472a = new a0.k(2);
    public static final a4.e f15473b = new a4.e(21);

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
        a4.e eVar2 = f15473b;
        a0.k kVar = f15472a;
        a8.a("FontProvider.getProvider");
        try {
            List list = eVar.d;
            String str = eVar.f15474a;
            String str2 = eVar.f15475b;
            if (list == null) {
                list = h0.b.h(resources, 0);
            }
            ?? obj = new Object();
            obj.f15469a = str;
            obj.f15470b = str2;
            obj.f15471c = list;
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
        b cVar;
        int i10;
        int i11;
        Uri withAppendedId;
        int i12;
        boolean z10;
        a8.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                cVar = new n2.e(context, build);
            } else {
                cVar = new ka.c(context, build);
            }
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            a8.a("ContentQueryWrapper.query");
            Cursor q6 = cVar.q(build, strArr, new String[]{eVar.f15476c});
            Trace.endSection();
            if (q6 != null && q6.getCount() > 0) {
                int columnIndex = q6.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = q6.getColumnIndex("_id");
                int columnIndex3 = q6.getColumnIndex("file_id");
                int columnIndex4 = q6.getColumnIndex("font_ttc_index");
                int columnIndex5 = q6.getColumnIndex("font_weight");
                int columnIndex6 = q6.getColumnIndex("font_italic");
                while (q6.moveToNext()) {
                    if (columnIndex != -1) {
                        i10 = q6.getInt(columnIndex);
                    } else {
                        i10 = 0;
                    }
                    if (columnIndex4 != -1) {
                        i11 = q6.getInt(columnIndex4);
                    } else {
                        i11 = 0;
                    }
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, q6.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, q6.getLong(columnIndex3));
                    }
                    Uri uri = withAppendedId;
                    if (columnIndex5 != -1) {
                        i12 = q6.getInt(columnIndex5);
                    } else {
                        i12 = 400;
                    }
                    if (columnIndex6 != -1 && q6.getInt(columnIndex6) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList2.add(new i(uri, i11, i12, z10, i10));
                }
                arrayList = arrayList2;
            }
            if (q6 != null) {
                q6.close();
            }
            cVar.close();
            return (i[]) arrayList.toArray(new i[0]);
        } finally {
            Trace.endSection();
        }
    }
}
