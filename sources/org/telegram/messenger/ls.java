package org.telegram.messenger;

import android.media.SoundPool;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class ls implements Runnable {
    public final int f25419a;
    public final xs f25420b;

    public ls(xs xsVar, int i7) {
        this.f25419a = i7;
        this.f25420b = xsVar;
    }

    @Override
    public final void run() {
        switch (this.f25419a) {
            case 0:
                xs xsVar = this.f25420b;
                ArrayList arrayList = xsVar.f27964a;
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    fj fjVar = (fj) arrayList.get(i7);
                    long B0 = fj.B0(fjVar.f23965k);
                    TLRPC.Message message = fjVar.f23965k;
                    if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !n5.C(B0) && (fjVar.f23965k.peer_id.channel_id == 0 || fjVar.A4())) {
                        arrayList2.add(0, fjVar);
                    }
                }
                if (!arrayList2.isEmpty() && !g0.p2(false) && !bz.C) {
                    g0.g3(new ns(xsVar, arrayList2, 0));
                    return;
                }
                return;
            case 1:
                xs xsVar2 = this.f25420b;
                xsVar2.getClass();
                int i10 = Calendar.getInstance().get(11);
                if (i10 >= 11 && i10 <= 22) {
                    xs.m0.b(xsVar2.f27972e0, null);
                    xsVar2.Z(true);
                    return;
                }
                xsVar2.R();
                return;
            case 2:
                xs xsVar3 = this.f25420b;
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - xsVar3.X) > 100) {
                        xsVar3.X = SystemClock.elapsedRealtime();
                        if (xsVar3.Y == null) {
                            SoundPool soundPool = new SoundPool(3, 1, 0);
                            xsVar3.Y = soundPool;
                            soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                                @Override
                                public final void onLoadComplete(SoundPool soundPool2, int i11, int i12) {
                                    switch (r1) {
                                        case 0:
                                            if (i12 == 0) {
                                                try {
                                                    soundPool2.play(i11, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    return;
                                                } catch (Exception e10) {
                                                    a8.g(e10, true);
                                                    return;
                                                }
                                            }
                                            return;
                                        default:
                                            if (i12 == 0) {
                                                try {
                                                    soundPool2.play(i11, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    return;
                                                } catch (Exception e11) {
                                                    a8.g(e11, true);
                                                    return;
                                                }
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        if (xsVar3.f27965a0 == 0 && !xsVar3.f27969c0) {
                            xsVar3.f27969c0 = true;
                            xsVar3.f27965a0 = xsVar3.Y.load(t0.f26913b, 2131624204, 1);
                        }
                        int i11 = xsVar3.f27965a0;
                        if (i11 != 0) {
                            try {
                                xsVar3.Y.play(i11, 1.0f, 1.0f, 1, 0, 1.0f);
                                return;
                            } catch (Exception e10) {
                                a8.g(e10, true);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 3:
                this.f25420b.Z(false);
                return;
            case 4:
                xs.c(this.f25420b);
                return;
            case 5:
                xs xsVar4 = this.f25420b;
                a0.h hVar = xsVar4.h;
                xs.m0.b(xsVar4.f27972e0, null);
                xsVar4.f27979n.b();
                for (int i12 = 0; i12 < hVar.m(); i12++) {
                    xs.m0.b(((Integer) hVar.n(i12)).intValue(), null);
                }
                hVar.b();
                return;
            case 6:
                xs xsVar5 = this.f25420b;
                a0.h hVar2 = xsVar5.f27968c;
                ArrayList arrayList3 = xsVar5.f27964a;
                int i13 = 0;
                boolean z10 = false;
                while (i13 < arrayList3.size()) {
                    fj fjVar2 = (fj) arrayList3.get(i13);
                    if (fjVar2 != null && fjVar2.J) {
                        arrayList3.remove(i13);
                        i13--;
                        SparseArray sparseArray = (SparseArray) hVar2.f(fj.B0(fjVar2.f23965k));
                        if (sparseArray != null) {
                            sparseArray.remove(fjVar2.e1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar2.l(fj.B0(fjVar2.f23965k));
                        }
                        z10 = true;
                    }
                    i13++;
                }
                tr messagesStorage = xsVar5.getMessagesStorage();
                messagesStorage.f27052a.c(new pq(messagesStorage, 19));
                if (z10) {
                    xsVar5.Z(false);
                    return;
                }
                return;
            case 7:
                xs xsVar6 = this.f25420b;
                xsVar6.S(xsVar6.z());
                return;
            case 8:
                xs xsVar7 = this.f25420b;
                if (Math.abs(SystemClock.elapsedRealtime()) > 500) {
                    try {
                        if (xsVar7.Y == null) {
                            SoundPool soundPool2 = new SoundPool(3, 1, 0);
                            xsVar7.Y = soundPool2;
                            soundPool2.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                                @Override
                                public final void onLoadComplete(SoundPool soundPool22, int i112, int i122) {
                                    switch (r1) {
                                        case 0:
                                            if (i122 == 0) {
                                                try {
                                                    soundPool22.play(i112, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    return;
                                                } catch (Exception e102) {
                                                    a8.g(e102, true);
                                                    return;
                                                }
                                            }
                                            return;
                                        default:
                                            if (i122 == 0) {
                                                try {
                                                    soundPool22.play(i112, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    return;
                                                } catch (Exception e112) {
                                                    a8.g(e112, true);
                                                    return;
                                                }
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        if (xsVar7.Z == 0 && !xsVar7.f27967b0) {
                            xsVar7.f27967b0 = true;
                            xsVar7.Z = xsVar7.Y.load(t0.f26913b, 2131624201, 1);
                        }
                        int i14 = xsVar7.Z;
                        if (i14 != 0) {
                            try {
                                xsVar7.Y.play(i14, 1.0f, 1.0f, 1, 0, 1.0f);
                                return;
                            } catch (Exception e12) {
                                a8.g(e12, true);
                                return;
                            }
                        }
                        return;
                    } catch (Exception e13) {
                        a8.g(e13, true);
                        return;
                    }
                }
                return;
            case 9:
                xs.b(this.f25420b);
                return;
            case 10:
                xs xsVar8 = this.f25420b;
                ArrayList arrayList4 = xsVar8.E;
                boolean isEmpty = arrayList4.isEmpty();
                arrayList4.clear();
                xsVar8.F.b();
                tr messagesStorage2 = xsVar8.getMessagesStorage();
                messagesStorage2.f27052a.c(new pq(messagesStorage2, 14));
                if (!isEmpty) {
                    xsVar8.Z(false);
                    return;
                }
                return;
            case 11:
                xs xsVar9 = this.f25420b;
                ArrayList arrayList5 = xsVar9.E;
                long currentTimeMillis = System.currentTimeMillis();
                int i15 = 0;
                boolean z11 = false;
                while (i15 < arrayList5.size()) {
                    ws wsVar = (ws) arrayList5.get(i15);
                    Iterator it = wsVar.f27758c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (currentTimeMillis >= ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue()) {
                            it.remove();
                            z11 = true;
                        }
                    }
                    if (z11) {
                        if (wsVar.f27758c.isEmpty()) {
                            tr messagesStorage3 = xsVar9.getMessagesStorage();
                            messagesStorage3.f27052a.c(new pp(messagesStorage3, wsVar.f27756a, 4));
                            arrayList5.remove(i15);
                            i15--;
                        } else {
                            tr messagesStorage4 = xsVar9.getMessagesStorage();
                            messagesStorage4.f27052a.c(new rq(9, messagesStorage4, wsVar));
                        }
                    }
                    i15++;
                }
                if (z11) {
                    xsVar9.Z(false);
                }
                xsVar9.d0();
                return;
            case 12:
                xs xsVar10 = this.f25420b;
                PowerManager.WakeLock wakeLock = xsVar10.W;
                ArrayList arrayList6 = xsVar10.f27966b;
                if (s2.f26721a) {
                    a8.b("delay reached");
                }
                if (!arrayList6.isEmpty()) {
                    xsVar10.Z(true);
                    arrayList6.clear();
                }
                try {
                    if (wakeLock.isHeld()) {
                        wakeLock.release();
                        return;
                    }
                    return;
                } catch (Exception e14) {
                    a8.g(e14, true);
                    return;
                }
            default:
                xs xsVar11 = this.f25420b;
                xsVar11.getNotificationCenter().b(xsVar11, 142);
                return;
        }
    }
}
