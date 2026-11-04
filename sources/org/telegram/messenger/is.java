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
public final class is implements Runnable {
    public final int f23577a;
    public final us f23578b;

    public is(us usVar, int i3) {
        this.f23577a = i3;
        this.f23578b = usVar;
    }

    @Override
    public final void run() {
        switch (this.f23577a) {
            case 0:
                us usVar = this.f23578b;
                ArrayList arrayList = usVar.f25755a;
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    zi ziVar = (zi) arrayList.get(i3);
                    long B0 = zi.B0(ziVar.f26868k);
                    TLRPC.Message message = ziVar.f26868k;
                    if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !m5.C(B0) && (ziVar.f26868k.peer_id.channel_id == 0 || ziVar.B4())) {
                        arrayList2.add(0, ziVar);
                    }
                }
                if (!arrayList2.isEmpty() && !g0.p2(false) && !az.C) {
                    g0.h3(new ks(usVar, arrayList2, 0));
                    return;
                }
                return;
            case 1:
                us usVar2 = this.f23578b;
                usVar2.getClass();
                int i10 = Calendar.getInstance().get(11);
                if (i10 >= 11 && i10 <= 22) {
                    us.m0.b(usVar2.f25763e0, null);
                    usVar2.Z(true);
                    return;
                }
                usVar2.R();
                return;
            case 2:
                us usVar3 = this.f23578b;
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - usVar3.X) > 100) {
                        usVar3.X = SystemClock.elapsedRealtime();
                        if (usVar3.Y == null) {
                            SoundPool soundPool = new SoundPool(3, 1, 0);
                            usVar3.Y = soundPool;
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
                        if (usVar3.f25756a0 == 0 && !usVar3.f25760c0) {
                            usVar3.f25760c0 = true;
                            usVar3.f25756a0 = usVar3.Y.load(t0.f25457b, 2131624203, 1);
                        }
                        int i11 = usVar3.f25756a0;
                        if (i11 != 0) {
                            try {
                                usVar3.Y.play(i11, 1.0f, 1.0f, 1, 0, 1.0f);
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
                this.f23578b.Z(false);
                return;
            case 4:
                us.c(this.f23578b);
                return;
            case 5:
                us usVar4 = this.f23578b;
                a0.h hVar = usVar4.h;
                us.m0.b(usVar4.f25763e0, null);
                usVar4.f25770n.b();
                for (int i12 = 0; i12 < hVar.m(); i12++) {
                    us.m0.b(((Integer) hVar.n(i12)).intValue(), null);
                }
                hVar.b();
                return;
            case 6:
                us usVar5 = this.f23578b;
                a0.h hVar2 = usVar5.f25759c;
                ArrayList arrayList3 = usVar5.f25755a;
                int i13 = 0;
                boolean z10 = false;
                while (i13 < arrayList3.size()) {
                    zi ziVar2 = (zi) arrayList3.get(i13);
                    if (ziVar2 != null && ziVar2.J) {
                        arrayList3.remove(i13);
                        i13--;
                        SparseArray sparseArray = (SparseArray) hVar2.f(zi.B0(ziVar2.f26868k));
                        if (sparseArray != null) {
                            sparseArray.remove(ziVar2.f1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar2.l(zi.B0(ziVar2.f26868k));
                        }
                        z10 = true;
                    }
                    i13++;
                }
                qr messagesStorage = usVar5.getMessagesStorage();
                messagesStorage.f24934a.c(new hq(messagesStorage, 18));
                if (z10) {
                    usVar5.Z(false);
                    return;
                }
                return;
            case 7:
                us usVar6 = this.f23578b;
                usVar6.S(usVar6.z());
                return;
            case 8:
                us usVar7 = this.f23578b;
                if (Math.abs(SystemClock.elapsedRealtime()) > 500) {
                    try {
                        if (usVar7.Y == null) {
                            SoundPool soundPool2 = new SoundPool(3, 1, 0);
                            usVar7.Y = soundPool2;
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
                        if (usVar7.Z == 0 && !usVar7.f25758b0) {
                            usVar7.f25758b0 = true;
                            usVar7.Z = usVar7.Y.load(t0.f25457b, 2131624200, 1);
                        }
                        int i14 = usVar7.Z;
                        if (i14 != 0) {
                            try {
                                usVar7.Y.play(i14, 1.0f, 1.0f, 1, 0, 1.0f);
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
                us.b(this.f23578b);
                return;
            case 10:
                us usVar8 = this.f23578b;
                ArrayList arrayList4 = usVar8.E;
                boolean isEmpty = arrayList4.isEmpty();
                arrayList4.clear();
                usVar8.F.b();
                qr messagesStorage2 = usVar8.getMessagesStorage();
                messagesStorage2.f24934a.c(new hq(messagesStorage2, 15));
                if (!isEmpty) {
                    usVar8.Z(false);
                    return;
                }
                return;
            case 11:
                us usVar9 = this.f23578b;
                ArrayList arrayList5 = usVar9.E;
                long currentTimeMillis = System.currentTimeMillis();
                int i15 = 0;
                boolean z11 = false;
                while (i15 < arrayList5.size()) {
                    ts tsVar = (ts) arrayList5.get(i15);
                    Iterator it = tsVar.f25589c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (currentTimeMillis >= ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue()) {
                            it.remove();
                            z11 = true;
                        }
                    }
                    if (z11) {
                        if (tsVar.f25589c.isEmpty()) {
                            qr messagesStorage3 = usVar9.getMessagesStorage();
                            messagesStorage3.f24934a.c(new op(messagesStorage3, tsVar.f25587a, 4));
                            arrayList5.remove(i15);
                            i15--;
                        } else {
                            qr messagesStorage4 = usVar9.getMessagesStorage();
                            messagesStorage4.f24934a.c(new pq(5, messagesStorage4, tsVar));
                        }
                    }
                    i15++;
                }
                if (z11) {
                    usVar9.Z(false);
                }
                usVar9.d0();
                return;
            case 12:
                us usVar10 = this.f23578b;
                PowerManager.WakeLock wakeLock = usVar10.W;
                ArrayList arrayList6 = usVar10.f25757b;
                if (r2.f25040a) {
                    a8.b("delay reached");
                }
                if (!arrayList6.isEmpty()) {
                    usVar10.Z(true);
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
                us usVar11 = this.f23578b;
                usVar11.getNotificationCenter().b(usVar11, 142);
                return;
        }
    }
}
