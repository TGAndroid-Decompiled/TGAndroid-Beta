package defpackage;

import android.media.SoundPool;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
public final class vo7 implements Runnable {
    public final byte a;
    public final ip7 b;

    public vo7(ip7 ip7Var, byte b) {
        this.a = b;
        this.b = ip7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ip7 ip7Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = ip7Var.a;
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    r47 r47Var = (r47) arrayList.get(i);
                    long B0 = r47.B0(r47Var.k);
                    TLRPC.Message message = r47Var.k;
                    if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !wf3.B(B0) && (r47Var.k.peer_id.channel_id == 0 || r47Var.z4())) {
                        arrayList2.add(0, r47Var);
                    }
                }
                if (!arrayList2.isEmpty() && !hl.n2(false) && !xea.B) {
                    hl.c3(new xo7(ip7Var, arrayList2, (byte) 0));
                    return;
                }
                return;
            case 1:
                int i2 = Calendar.getInstance().get(11);
                if (i2 >= 11 && i2 <= 22) {
                    ip7.m0.b(ip7Var.e0, null);
                    ip7Var.Z(true);
                    return;
                }
                ip7Var.R();
                return;
            case 2:
                ip7Var.z();
                return;
            case 3:
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - ip7Var.X) > 100) {
                        ip7Var.X = SystemClock.elapsedRealtime();
                        if (ip7Var.Y == null) {
                            SoundPool soundPool = new SoundPool(3, 1, 0);
                            ip7Var.Y = soundPool;
                            soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                                @Override
                                public final void onLoadComplete(SoundPool soundPool2, int i3, int i4) {
                                    switch (r1) {
                                        case 0:
                                            if (i4 == 0) {
                                                try {
                                                    soundPool2.play(i3, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    return;
                                                } catch (Exception e) {
                                                    cc4.g(e, true);
                                                    return;
                                                }
                                            }
                                            return;
                                        default:
                                            if (i4 == 0) {
                                                try {
                                                    soundPool2.play(i3, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    return;
                                                } catch (Exception e2) {
                                                    cc4.g(e2, true);
                                                    return;
                                                }
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        int i3 = ip7Var.a0;
                        if (i3 == 0 && !ip7Var.c0) {
                            ip7Var.c0 = true;
                            i3 = ip7Var.Y.load(a.b, 2131624198, 1);
                            ip7Var.a0 = i3;
                        }
                        int i4 = i3;
                        if (i4 != 0) {
                            try {
                                ip7Var.Y.play(i4, 1.0f, 1.0f, 1, 0, 1.0f);
                                return;
                            } catch (Exception e) {
                                cc4.g(e, true);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 4:
                ip7Var.Z(false);
                return;
            case 5:
                ip7Var.getClass();
                if (Math.abs(SystemClock.elapsedRealtime()) > 500) {
                    try {
                        if (ip7Var.Y == null) {
                            SoundPool soundPool2 = new SoundPool(3, 1, 0);
                            ip7Var.Y = soundPool2;
                            soundPool2.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                                @Override
                                public final void onLoadComplete(SoundPool soundPool22, int i32, int i42) {
                                    switch (r1) {
                                        case 0:
                                            if (i42 == 0) {
                                                try {
                                                    soundPool22.play(i32, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    return;
                                                } catch (Exception e3) {
                                                    cc4.g(e3, true);
                                                    return;
                                                }
                                            }
                                            return;
                                        default:
                                            if (i42 == 0) {
                                                try {
                                                    soundPool22.play(i32, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    return;
                                                } catch (Exception e22) {
                                                    cc4.g(e22, true);
                                                    return;
                                                }
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        int i5 = ip7Var.Z;
                        if (i5 == 0 && !ip7Var.b0) {
                            ip7Var.b0 = true;
                            i5 = ip7Var.Y.load(a.b, 2131624195, 1);
                            ip7Var.Z = i5;
                        }
                        int i6 = i5;
                        if (i6 != 0) {
                            try {
                                ip7Var.Y.play(i6, 1.0f, 1.0f, 1, 0, 1.0f);
                                return;
                            } catch (Exception e3) {
                                cc4.g(e3, true);
                                return;
                            }
                        }
                        return;
                    } catch (Exception e4) {
                        cc4.g(e4, true);
                        return;
                    }
                }
                return;
            case 6:
                zh6 zh6Var = ip7Var.c;
                ArrayList arrayList3 = ip7Var.a;
                int i7 = 0;
                boolean z = false;
                while (i7 < arrayList3.size()) {
                    r47 r47Var2 = (r47) arrayList3.get(i7);
                    if (r47Var2 != null && r47Var2.J) {
                        arrayList3.remove(i7);
                        i7--;
                        SparseArray sparseArray = (SparseArray) zh6Var.f(r47.B0(r47Var2.k));
                        if (sparseArray != null) {
                            sparseArray.remove(r47Var2.e1());
                            if (sparseArray.size() <= 0) {
                                zh6Var.l(r47.B0(r47Var2.k));
                            }
                        }
                        z = true;
                    }
                    i7++;
                }
                jf7 messagesStorage = ip7Var.getMessagesStorage();
                messagesStorage.a.c(new be7(messagesStorage, (byte) 14));
                if (z) {
                    ip7Var.Z(false);
                    return;
                }
                return;
            case 7:
                ip7Var.A();
                return;
            case 8:
                ArrayList arrayList4 = ip7Var.E;
                boolean isEmpty = arrayList4.isEmpty();
                arrayList4.clear();
                ip7Var.F.b();
                jf7 messagesStorage2 = ip7Var.getMessagesStorage();
                messagesStorage2.a.c(new be7(messagesStorage2, (byte) 13));
                if (!isEmpty) {
                    ip7Var.Z(false);
                    return;
                }
                return;
            case 9:
                zh6 zh6Var2 = ip7Var.h;
                ip7.m0.b(ip7Var.e0, null);
                ip7Var.n.b();
                for (int i8 = 0; i8 < zh6Var2.m(); i8++) {
                    ip7.m0.b(((Integer) zh6Var2.n(i8)).intValue(), null);
                }
                zh6Var2.b();
                return;
            case 10:
                ip7Var.S(ip7Var.t());
                return;
            case 11:
                ArrayList arrayList5 = ip7Var.E;
                long currentTimeMillis = System.currentTimeMillis();
                int i9 = 0;
                boolean z2 = false;
                while (i9 < arrayList5.size()) {
                    hp7 hp7Var = (hp7) arrayList5.get(i9);
                    Iterator it = hp7Var.c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (currentTimeMillis >= ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue()) {
                            it.remove();
                            z2 = true;
                        }
                    }
                    if (z2) {
                        if (hp7Var.c.isEmpty()) {
                            jf7 messagesStorage3 = ip7Var.getMessagesStorage();
                            messagesStorage3.a.c(new le7(messagesStorage3, hp7Var.a, (byte) 2));
                            arrayList5.remove(i9);
                            i9--;
                        } else {
                            jf7 messagesStorage4 = ip7Var.getMessagesStorage();
                            messagesStorage4.a.c(new t87(messagesStorage4, hp7Var, (byte) 24));
                        }
                    }
                    i9++;
                }
                if (z2) {
                    ip7Var.Z(false);
                }
                ip7Var.d0();
                return;
            case 12:
                PowerManager.WakeLock wakeLock = ip7Var.W;
                ArrayList arrayList6 = ip7Var.b;
                if (f11.a) {
                    cc4.b("delay reached");
                }
                if (!arrayList6.isEmpty()) {
                    ip7Var.Z(true);
                    arrayList6.clear();
                }
                try {
                    if (wakeLock.isHeld()) {
                        wakeLock.release();
                        return;
                    }
                    return;
                } catch (Exception e5) {
                    cc4.g(e5, true);
                    return;
                }
            default:
                ip7Var.getNotificationCenter().a(ip7Var, 143);
                return;
        }
    }
}
