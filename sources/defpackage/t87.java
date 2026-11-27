package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
public final class t87 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public t87(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        jf7 jf7Var = (jf7) this.b;
        HashMap hashMap = (HashMap) this.c;
        for (if7 if7Var : hashMap.keySet()) {
            Integer num = (Integer) hashMap.get(if7Var);
            num.getClass();
            try {
                SQLiteDatabase sQLiteDatabase = jf7Var.b;
                Locale locale = Locale.US;
                long j = if7Var.a;
                long j2 = if7Var.b;
                sQLiteDatabase.executeFast("UPDATE topics SET read_outbox = max((SELECT read_outbox FROM topics WHERE did = " + j + " AND topic_id = " + j2 + "), " + num + ") WHERE did = " + j + " AND topic_id = " + j2).stepThis().dispose();
            } catch (SQLiteException e) {
                jf7Var.n(e, true);
            }
        }
    }

    private final void b() {
        Context context = (Context) this.c;
        yv2 yv2Var = (yv2) ((ak) this.b).b;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i = type != 9 ? 8 : 7;
                                }
                                i = 5;
                            }
                        }
                        i = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i = 4;
                            break;
                        case 13:
                            i = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i = 6;
                            break;
                        case 18:
                            i = 2;
                            break;
                        case 20:
                            if (Build.VERSION.SDK_INT >= 29) {
                                i = 9;
                                break;
                            }
                            break;
                    }
                } else {
                    i = 1;
                }
            } catch (SecurityException unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && i == 5) {
            zz.g(context, yv2Var);
        } else {
            yv2Var.i(i);
        }
    }

    private final void c() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:+" + ((String) this.c)));
        intent.putExtra("sms_body", ob6.a0(null, null, 2131748870, "https://telegram.org/dl"));
        ((rl7) this.b).getContext().startActivity(intent);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t87.run():void");
    }
}
