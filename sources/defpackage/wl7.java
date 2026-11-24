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
public final class wl7 implements Runnable {
    public final byte a;
    public final im7 b;

    public wl7(im7 im7Var, byte b) {
        this.a = b;
        this.b = im7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        im7 im7Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = im7Var.a;
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    k27 k27Var = (k27) arrayList.get(i);
                    long B0 = k27.B0(k27Var.k);
                    TLRPC.Message message = k27Var.k;
                    if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !cf3.B(B0) && (k27Var.k.peer_id.channel_id == 0 || k27Var.z4())) {
                        arrayList2.add(0, k27Var);
                    }
                }
                if (!arrayList2.isEmpty() && !gl.n2(false) && !gba.B) {
                    gl.c3(new yl7(im7Var, arrayList2, (byte) 0));
                    return;
                }
                return;
            case 1:
                int i2 = Calendar.getInstance().get(11);
                if (i2 >= 11 && i2 <= 22) {
                    im7.m0.b(im7Var.e0, null);
                    im7Var.Z(true);
                    return;
                }
                im7Var.R();
                return;
            case 2:
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - im7Var.X) > 100) {
                        im7Var.X = SystemClock.elapsedRealtime();
                        if (im7Var.Y == null) {
                            SoundPool soundPool = new SoundPool(3, 1, 0);
                            im7Var.Y = soundPool;
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
                                                    fa4.g(e, true);
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
                                                    fa4.g(e2, true);
                                                    return;
                                                }
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        int i3 = im7Var.a0;
                        if (i3 == 0 && !im7Var.c0) {
                            im7Var.c0 = true;
                            i3 = im7Var.Y.load(a.b, 2131624198, 1);
                            im7Var.a0 = i3;
                        }
                        int i4 = i3;
                        if (i4 != 0) {
                            try {
                                im7Var.Y.play(i4, 1.0f, 1.0f, 1, 0, 1.0f);
                                return;
                            } catch (Exception e) {
                                fa4.g(e, true);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 3:
                im7Var.Z(false);
                return;
            case 4:
                im7Var.z();
                return;
            case 5:
                vf6 vf6Var = im7Var.h;
                im7.m0.b(im7Var.e0, null);
                im7Var.n.b();
                for (int i5 = 0; i5 < vf6Var.m(); i5++) {
                    im7.m0.b(((Integer) vf6Var.n(i5)).intValue(), null);
                }
                vf6Var.b();
                return;
            case 6:
                im7Var.S(im7Var.t());
                return;
            case 7:
                vf6 vf6Var2 = im7Var.c;
                ArrayList arrayList3 = im7Var.a;
                int i6 = 0;
                boolean z = false;
                while (i6 < arrayList3.size()) {
                    k27 k27Var2 = (k27) arrayList3.get(i6);
                    if (k27Var2 != null && k27Var2.J) {
                        arrayList3.remove(i6);
                        i6--;
                        SparseArray sparseArray = (SparseArray) vf6Var2.f(k27.B0(k27Var2.k));
                        if (sparseArray != null) {
                            sparseArray.remove(k27Var2.e1());
                            if (sparseArray.size() <= 0) {
                                vf6Var2.l(k27.B0(k27Var2.k));
                            }
                        }
                        z = true;
                    }
                    i6++;
                }
                ad7 messagesStorage = im7Var.getMessagesStorage();
                messagesStorage.a.c(new vb7(messagesStorage, (byte) 19));
                if (z) {
                    im7Var.Z(false);
                    return;
                }
                return;
            case 8:
                im7Var.getClass();
                if (Math.abs(SystemClock.elapsedRealtime()) > 500) {
                    try {
                        if (im7Var.Y == null) {
                            SoundPool soundPool2 = new SoundPool(3, 1, 0);
                            im7Var.Y = soundPool2;
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
                                                    fa4.g(e3, true);
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
                                                    fa4.g(e22, true);
                                                    return;
                                                }
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        int i7 = im7Var.Z;
                        if (i7 == 0 && !im7Var.b0) {
                            im7Var.b0 = true;
                            i7 = im7Var.Y.load(a.b, 2131624195, 1);
                            im7Var.Z = i7;
                        }
                        int i8 = i7;
                        if (i8 != 0) {
                            try {
                                im7Var.Y.play(i8, 1.0f, 1.0f, 1, 0, 1.0f);
                                return;
                            } catch (Exception e3) {
                                fa4.g(e3, true);
                                return;
                            }
                        }
                        return;
                    } catch (Exception e4) {
                        fa4.g(e4, true);
                        return;
                    }
                }
                return;
            case 9:
                im7Var.A();
                return;
            case 10:
                ArrayList arrayList4 = im7Var.E;
                boolean isEmpty = arrayList4.isEmpty();
                arrayList4.clear();
                im7Var.F.b();
                ad7 messagesStorage2 = im7Var.getMessagesStorage();
                messagesStorage2.a.c(new vb7(messagesStorage2, (byte) 14));
                if (!isEmpty) {
                    im7Var.Z(false);
                    return;
                }
                return;
            case 11:
                ArrayList arrayList5 = im7Var.E;
                long currentTimeMillis = System.currentTimeMillis();
                int i9 = 0;
                boolean z2 = false;
                while (i9 < arrayList5.size()) {
                    hm7 hm7Var = (hm7) arrayList5.get(i9);
                    Iterator it = hm7Var.c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (currentTimeMillis >= ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue()) {
                            it.remove();
                            z2 = true;
                        }
                    }
                    if (z2) {
                        if (hm7Var.c.isEmpty()) {
                            ad7 messagesStorage3 = im7Var.getMessagesStorage();
                            messagesStorage3.a.c(new ua7(messagesStorage3, hm7Var.a, (byte) 4));
                            arrayList5.remove(i9);
                            i9--;
                        } else {
                            ad7 messagesStorage4 = im7Var.getMessagesStorage();
                            messagesStorage4.a.c(new t67(messagesStorage4, hm7Var, (byte) 27));
                        }
                    }
                    i9++;
                }
                if (z2) {
                    im7Var.Z(false);
                }
                im7Var.d0();
                return;
            case 12:
                PowerManager.WakeLock wakeLock = im7Var.W;
                ArrayList arrayList6 = im7Var.b;
                if (w01.a) {
                    fa4.b("delay reached");
                }
                if (!arrayList6.isEmpty()) {
                    im7Var.Z(true);
                    arrayList6.clear();
                }
                try {
                    if (wakeLock.isHeld()) {
                        wakeLock.release();
                        return;
                    }
                    return;
                } catch (Exception e5) {
                    fa4.g(e5, true);
                    return;
                }
            default:
                im7Var.getNotificationCenter().a(im7Var, 142);
                return;
        }
    }
}
