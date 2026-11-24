package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public abstract class wn4 {
    public static final fi6 a = new fi6(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final cka d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) new Object());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new cka(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((pn4) list.get(i2)).e);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static vn4 b(String str, Context context, List list, int i) {
        vn4 vn4Var;
        int i2;
        Typeface b2;
        fi6 fi6Var = a;
        yxe.a("getFontSync");
        try {
            Typeface typeface = (Typeface) fi6Var.a(str);
            if (typeface != null) {
                vn4Var = new vn4(typeface);
            } else {
                try {
                    bo4 a2 = on4.a(context, list);
                    List list2 = a2.b;
                    boolean z = a2.c;
                    if (z) {
                        if (z) {
                            i2 = -2;
                        }
                        i2 = -3;
                    } else {
                        co4[] co4VarArr = (co4[]) list2.get(0);
                        if (co4VarArr != null && co4VarArr.length != 0) {
                            int length = co4VarArr.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length) {
                                    int i4 = co4VarArr[i3].e;
                                    if (i4 != 0) {
                                        if (i4 >= 0) {
                                            i2 = i4;
                                        }
                                    } else {
                                        i3++;
                                    }
                                } else {
                                    i2 = 0;
                                    break;
                                }
                            }
                            i2 = -3;
                        } else {
                            i2 = 1;
                        }
                    }
                    if (i2 != 0) {
                        vn4Var = new vn4(i2);
                    } else {
                        if (list2.size() > 1 && Build.VERSION.SDK_INT >= 29) {
                            xye xyeVar = s5c.a;
                            yxe.a("TypefaceCompat.createFromFontInfoWithFallback");
                            b2 = s5c.a.c(context, list2, i);
                            Trace.endSection();
                        } else {
                            co4[] co4VarArr2 = (co4[]) list2.get(0);
                            xye xyeVar2 = s5c.a;
                            yxe.a("TypefaceCompat.createFromFontInfo");
                            b2 = s5c.a.b(context, co4VarArr2, i);
                            Trace.endSection();
                        }
                        if (b2 != null) {
                            fi6Var.b(str, b2);
                            vn4Var = new vn4(b2);
                        } else {
                            vn4Var = new vn4(-3);
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    vn4Var = new vn4(-1);
                }
            }
            return vn4Var;
        } finally {
            Trace.endSection();
        }
    }
}
