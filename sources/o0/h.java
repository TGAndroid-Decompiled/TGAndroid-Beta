package o0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import g7.l8;
import g7.x7;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class h {

    public static final a0.j f19104a = new a0.j(16);

    public static final ThreadPoolExecutor f19105b;

    public static final Object f19106c;
    public static final a0.k d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new l());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f19105b = threadPoolExecutor;
        f19106c = new Object();
        d = new a0.k(0);
    }

    public static String a(int i10, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(((e) list.get(i11)).f19097e);
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static g b(String str, Context context, List list, int i10) {
        int i11;
        Typeface typefaceB;
        a0.j jVar = f19104a;
        l8.a("getFontSync");
        try {
            Typeface typeface = (Typeface) jVar.a(str);
            if (typeface != null) {
                g gVar = new g(typeface);
                Trace.endSection();
                return gVar;
            }
            try {
                i iVarA = d.a(context, list);
                List list2 = iVarA.f19108b;
                int i12 = iVarA.f19107a;
                if (i12 == 0) {
                    j[] jVarArr = (j[]) list2.get(0);
                    if (jVarArr == null || jVarArr.length == 0) {
                        i11 = 1;
                    } else {
                        int length = jVarArr.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= length) {
                                i11 = 0;
                                break;
                            }
                            int i14 = jVarArr[i13].f19112e;
                            if (i14 != 0) {
                                if (i14 >= 0) {
                                    i11 = i14;
                                    break;
                                }
                                i11 = -3;
                                break;
                            }
                            i13++;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        i11 = -3;
                        break;
                    }
                    i11 = -2;
                }
                if (i11 != 0) {
                    g gVar2 = new g(i11);
                    Trace.endSection();
                    return gVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    j[] jVarArr2 = (j[]) list2.get(0);
                    x7 x7Var = i0.f.f10495a;
                    l8.a("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceB = i0.f.f10495a.b(context, jVarArr2, i10);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    x7 x7Var2 = i0.f.f10495a;
                    l8.a("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceB = i0.f.f10495a.c(context, list2, i10);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceB == null) {
                    g gVar3 = new g(-3);
                    Trace.endSection();
                    return gVar3;
                }
                jVar.b(str, typefaceB);
                g gVar4 = new g(typefaceB);
                Trace.endSection();
                return gVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                g gVar5 = new g(-1);
                Trace.endSection();
                return gVar5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
