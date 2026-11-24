package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class fha implements jm7 {
    public boolean E;
    public final e7a F;
    public boolean f;
    public boolean h;
    public final cha[] n;
    public final long r;
    public final long s;
    public long w;
    public final d x;
    public int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList y = new ArrayList();

    public fha(d dVar) {
        int i;
        TLRPC.ChatFull M0;
        this.x = dVar;
        if (dVar instanceof f02) {
            f02 f02Var = (f02) dVar;
            long a = f02Var.a();
            this.r = a;
            this.w = f02Var.M();
            this.s = f02Var.d();
            if (a != dVar.getUserConfig().e()) {
                dVar.getMessagesController().E1().f(a, new qac(this) {
                    public final fha b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        byte b = r2;
                        int i2 = 0;
                        fha fhaVar = this.b;
                        Boolean bool = (Boolean) obj;
                        switch (b) {
                            case 0:
                                ArrayList arrayList = fhaVar.y;
                                boolean booleanValue = bool.booleanValue();
                                fhaVar.f = booleanValue;
                                fhaVar.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    while (i2 < size) {
                                        ((gha) arrayList.get(i2)).Q();
                                        i2++;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList2 = fhaVar.y;
                                boolean booleanValue2 = bool.booleanValue();
                                fhaVar.f = booleanValue2;
                                fhaVar.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    while (i2 < size2) {
                                        ((gha) arrayList2.get(i2)).Q();
                                        i2++;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } else if (dVar instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) dVar;
            if (profileActivity.h1) {
                this.r = profileActivity.getUserConfig().e();
                this.s = profileActivity.a();
            } else {
                long a2 = profileActivity.a();
                this.r = a2;
                this.s = profileActivity.g1;
                TLRPC.ChatFull chatFull = profileActivity.v2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a2 != dVar.getUserConfig().e()) {
                    dVar.getMessagesController().E1().f(a2, new qac(this) {
                        public final fha b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            byte b = r2;
                            int i2 = 0;
                            fha fhaVar = this.b;
                            Boolean bool = (Boolean) obj;
                            switch (b) {
                                case 0:
                                    ArrayList arrayList = fhaVar.y;
                                    boolean booleanValue = bool.booleanValue();
                                    fhaVar.f = booleanValue;
                                    fhaVar.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        while (i2 < size) {
                                            ((gha) arrayList.get(i2)).Q();
                                            i2++;
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    ArrayList arrayList2 = fhaVar.y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    fhaVar.f = booleanValue2;
                                    fhaVar.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        while (i2 < size2) {
                                            ((gha) arrayList2.get(i2)).Q();
                                            i2++;
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (dVar instanceof cm6) {
            this.r = ((cm6) dVar).e;
        } else if (dVar instanceof nk3) {
            this.r = dVar.getUserConfig().e();
        }
        if (this.w == 0 && pg3.y(this.r) && (M0 = dVar.getMessagesController().M0(-this.r)) != null) {
            long j = M0.migrated_from_chat_id;
            if (j != 0) {
                this.w = -j;
            }
        }
        this.n = new cha[9];
        int i2 = 0;
        while (true) {
            cha[] chaVarArr = this.n;
            if (i2 >= chaVarArr.length) {
                break;
            }
            chaVarArr[i2] = new cha();
            cha chaVar = this.n[i2];
            if (pg3.B(this.r)) {
                i = Integer.MIN_VALUE;
            } else {
                i = Integer.MAX_VALUE;
            }
            chaVar.j[0] = i;
            this.n[i2].j[1] = Integer.MAX_VALUE;
            i2++;
        }
        a();
        d dVar2 = this.x;
        if (dVar2 == null) {
            this.F = null;
            return;
        }
        nm7 notificationCenter = dVar2.getNotificationCenter();
        notificationCenter.getClass();
        e7a e7aVar = new e7a(notificationCenter, this);
        e7aVar.b(nm7.X);
        e7aVar.b(nm7.W);
        e7aVar.b(1);
        e7aVar.b(nm7.J);
        e7aVar.b(nm7.V);
        e7aVar.b(nm7.v);
        e7aVar.b(nm7.m0);
        e7aVar.b(nm7.T);
        e7aVar.b(nm7.Y1);
        e7aVar.b(nm7.B5);
        e7aVar.b(nm7.i3);
        this.F = e7aVar;
    }

    public final void a() {
        d dVar = this.x;
        if (dVar != null) {
            hs6 mediaDataController = dVar.getMediaDataController();
            long j = this.s;
            mediaDataController.g0(this.r, dVar.getClassGuid(), j);
            if (this.w != 0) {
                dVar.getMediaDataController().g0(this.w, dVar.getClassGuid(), this.s);
            }
        }
    }

    public final void b(d dVar) {
        if (dVar == this.x) {
            this.y.clear();
            e7a e7aVar = this.F;
            if (e7aVar != null) {
                e7aVar.a();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        d dVar = this.x;
        if (dVar != null && chatFull != null) {
            long j = chatFull.migrated_from_chat_id;
            if (j != 0 && this.w == 0) {
                this.w = -j;
                dVar.getMediaDataController().g0(this.w, dVar.getClassGuid(), this.s);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fha.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
