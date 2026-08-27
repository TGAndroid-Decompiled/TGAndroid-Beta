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
import g7.l8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import n2.b0;

public abstract class d {

    public static final a0.j f19092a = new a0.j(2);

    public static final k9.a f19093b = new k9.a(5);

    public static i a(Context context, List list) {
        l8.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                e eVar = (e) list.get(i10);
                ProviderInfo providerInfoB = b(context.getPackageManager(), eVar, context.getResources());
                if (providerInfoB == null) {
                    return new i();
                }
                arrayList.add(c(context, eVar, providerInfoB.authority));
            }
            return new i(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, e eVar, Resources resources) {
        k9.a aVar = f19093b;
        a0.j jVar = f19092a;
        l8.a("FontProvider.getProvider");
        try {
            List listH = eVar.d;
            String str = eVar.f19094a;
            String str2 = eVar.f19095b;
            if (listH == null) {
                listH = h0.b.h(resources, 0);
            }
            c cVar = new c();
            cVar.f19089a = str;
            cVar.f19090b = str2;
            cVar.f19091c = listH;
            ProviderInfo providerInfo = (ProviderInfo) jVar.a(cVar);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, aVar);
            for (int i10 = 0; i10 < listH.size(); i10++) {
                ArrayList arrayList2 = new ArrayList((Collection) listH.get(i10));
                Collections.sort(arrayList2, aVar);
                if (arrayList.size() == arrayList2.size()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            jVar.b(cVar, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i11), (byte[]) arrayList2.get(i11))) {
                            break;
                        }
                        i11++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static j[] c(Context context, e eVar, String str) {
        l8.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            a b0Var = Build.VERSION.SDK_INT < 24 ? new b0(context, uriBuild) : new b(context, uriBuild);
            Cursor cursorD = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                l8.a("ContentQueryWrapper.query");
                try {
                    cursorD = b0Var.d(uriBuild, strArr, new String[]{eVar.f19096c});
                    Trace.endSection();
                    if (cursorD != null && cursorD.getCount() > 0) {
                        int columnIndex = cursorD.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorD.getColumnIndex("_id");
                        int columnIndex3 = cursorD.getColumnIndex("file_id");
                        int columnIndex4 = cursorD.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorD.getColumnIndex("font_weight");
                        int columnIndex6 = cursorD.getColumnIndex("font_italic");
                        while (cursorD.moveToNext()) {
                            int i10 = columnIndex != -1 ? cursorD.getInt(columnIndex) : 0;
                            arrayList2.add(new j(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorD.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorD.getLong(columnIndex3)), columnIndex4 != -1 ? cursorD.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorD.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorD.getInt(columnIndex6) == 1, i10));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorD != null) {
                        cursorD.close();
                    }
                    b0Var.close();
                    return (j[]) arrayList.toArray(new j[0]);
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                if (cursorD != null) {
                    cursorD.close();
                }
                b0Var.close();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
