package af;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import c2.b1;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.v;
import f5.d0;
import f5.t;
import f5.u;
import j3.m2;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.jk;
public final class c extends BroadcastReceiver {
    public final int f369a;
    public Object f370b;

    public c() {
        this.f369a = 3;
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((FirebaseMessaging) ((v) this.f370b).d).f5113b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        switch (this.f369a) {
            case 0:
                if ("PIP_CUSTOM_EVENT".equals(intent.getAction())) {
                    String stringExtra = intent.getStringExtra("source_id");
                    intent.getIntExtra("action_id", -1);
                    ArrayList arrayList = (ArrayList) ((d) this.f370b).f373c.get(stringExtra);
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            it.next().getClass();
                            throw new ClassCastException();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((androidx.mediarouter.app.f) this.f370b).dismiss();
                    return;
                }
                return;
            case 2:
                ((b1) this.f370b).c();
                return;
            case 3:
                v vVar = (v) this.f370b;
                if (vVar != null && vVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    v vVar2 = (v) this.f370b;
                    ((FirebaseMessaging) vVar2.d).getClass();
                    FirebaseMessaging.b(vVar2, 0L);
                    ((FirebaseMessaging) ((v) this.f370b).d).f5113b.unregisterReceiver(this);
                    this.f370b = null;
                    return;
                }
                return;
            case 4:
                u uVar = (u) this.f370b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i10 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i10 = type != 9 ? 8 : 7;
                                        }
                                        i10 = 5;
                                    }
                                }
                                i10 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i10 = 3;
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
                                    i10 = 4;
                                    break;
                                case 13:
                                    i10 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i10 = 6;
                                    break;
                                case 18:
                                    i10 = 2;
                                    break;
                                case 20:
                                    if (d0.f6579a >= 29) {
                                        i10 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i10 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (d0.f6579a >= 31 && i10 == 5) {
                    t.a(context, uVar);
                    return;
                } else {
                    u.c(uVar, i10);
                    return;
                }
            case 5:
                ((f2.v) this.f370b).k();
                return;
            case 6:
                try {
                    ((IntentSender) this.f370b).sendIntent(context, 0, null, null, null);
                    return;
                } catch (IntentSender.SendIntentException unused2) {
                    return;
                }
            case 7:
                m2 m2Var = (m2) this.f370b;
                m2Var.f10630b.post(new cg.m2(m2Var, 26));
                return;
            default:
                ig igVar = new ig(this, 22);
                if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    ((jk) this.f370b).f29678r.postDelayed(igVar, 1000L);
                    return;
                } else {
                    igVar.run();
                    return;
                }
        }
    }

    public c(Object obj, int i10) {
        this.f369a = i10;
        this.f370b = obj;
    }
}
