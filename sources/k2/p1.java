package k2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.internal.cast.g4;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bj0;
public abstract class p1 {
    public static int A(int i3, int i10, int i11, int i12) {
        return Math.max(i12, Math.min(Math.max(i3, i10), i11));
    }

    public static void B(String str, int i3, AlertDialog$Builder alertDialog$Builder, org.telegram.ui.ActionBar.p1 p1Var) {
        alertDialog$Builder.k(bd.M0(i3, str), p1Var);
        alertDialog$Builder.p();
    }

    public static int C(int i3, int i10, int i11, int i12) {
        return Math.max(i12, Math.min(Math.min(i3, i10), i11));
    }

    public static int a(int i3, int i10, int i11, int i12) {
        return i3 | i10 | i11 | 128 | i12;
    }

    public static boolean b(int i3, boolean z10) {
        int i10 = i3 & 7;
        if (i10 != 4) {
            if (!z10 || i10 != 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static double c(double d, double d10, double d11) {
        return (Math.cos(d) * d10) + d11;
    }

    public static int d(float f10, int i3, int i10) {
        return Math.max(i10, i3 - org.telegram.messenger.g0.L(f10));
    }

    public static int e(int i3, int i10, int i11, int i12) {
        return ((i3 - i10) / i11) + i12;
    }

    public static int f(int i3, int i10, ArrayList arrayList) {
        return i10 - (arrayList.size() + i3);
    }

    public static Drawable g(Context context, int i3) {
        return context.getResources().getDrawable(i3).mutate();
    }

    public static Object h(int i3, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i3);
    }

    public static String i(int i3, String str) {
        return str + i3;
    }

    public static String j(int i3, String str, String str2) {
        return str + i3 + str2;
    }

    public static String k(int i3, String str, StringBuilder sb2) {
        sb2.append(bd.M0(i3, str));
        return sb2.toString();
    }

    public static String l(long j10, char c2, StringBuilder sb2) {
        sb2.append(bd.E(j10, c2));
        return sb2.toString();
    }

    public static StringBuilder m(int i3, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i3);
        sb2.append(str2);
        return sb2;
    }

    public static HashMap n(Class cls, pa.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static Map o(HashMap hashMap) {
        return DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static bj0 p(View view, View view2, int i3, int i10) {
        view.setLayoutParams(new u4.p0(i3, i10));
        return new u4.d1(view2);
    }

    public static void q(int i3, StringBuilder sb2) {
        sb2.append(i3);
        a8.b(sb2.toString());
    }

    public static void r(long j10, StringBuilder sb2) {
        sb2.append(j10);
        a8.b(sb2.toString());
    }

    public static void s(MediaMetadataRetriever mediaMetadataRetriever) {
        if (mediaMetadataRetriever instanceof AutoCloseable) {
            mediaMetadataRetriever.close();
        } else if (mediaMetadataRetriever instanceof ExecutorService) {
            g4.b();
        } else if (com.google.android.recaptcha.internal.a.u(mediaMetadataRetriever)) {
            mediaMetadataRetriever.release();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void t(TextView textView, int i3, float f10) {
        textView.setTextSize(i3, f10);
        textView.setTypeface(org.telegram.messenger.g0.o());
    }

    public static void u(TextView textView, int i3, float f10, String str, int i10) {
        textView.setTextSize(i3, f10);
        textView.setText(bd.M0(i10, str));
    }

    public static void v(String str, int i3, AlertDialog$Builder alertDialog$Builder, org.telegram.ui.ActionBar.p1 p1Var) {
        alertDialog$Builder.h(bd.M0(i3, str), p1Var);
        alertDialog$Builder.p();
    }

    public static void w(String str, StringBuilder sb2) {
        sb2.append(str);
        a8.b(sb2.toString());
    }

    public static void x(kg.m mVar, int i3, ArrayList arrayList) {
        arrayList.add(new kg.k(mVar, i3));
    }

    public static void y(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
    }

    public static boolean z(String str, String str2, String str3) {
        return str3.contains(str + str2);
    }
}
