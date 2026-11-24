package defpackage;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.EditText;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class hg implements ee, x76, ln5, iz6, lz6, af7, fu2 {
    public final byte a;
    public final long b;
    public final int c;
    public final Object d;

    public hg(tk tkVar, int i, long j, long j2) {
        this.a = (byte) 2;
        this.d = tkVar;
        this.c = i;
        this.b = j;
    }

    @Override
    public final void a(String str) {
        ((nha) this.d).F0(this.c, str, this.b);
    }

    @Override
    public final void accept(Object obj) {
        boolean z;
        wcb wcbVar = (wcb) this.d;
        i53 i53Var = (i53) obj;
        wcbVar.h.getClass();
        byte[] l3 = k4f.l3(i53Var.a, i53Var.c);
        yw7 yw7Var = wcbVar.c;
        yw7Var.L(l3.length, l3);
        wcbVar.a.e(l3.length, yw7Var);
        long j = i53Var.b;
        int i = (j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1));
        go4 go4Var = wcbVar.h;
        long j2 = this.b;
        if (i == 0) {
            if (go4Var.y == Long.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            jte.p(z);
        } else {
            long j3 = go4Var.y;
            if (j3 == Long.MAX_VALUE) {
                j2 += j;
            } else {
                j2 = j + j3;
            }
        }
        wcbVar.a.a(j2, this.c | 1, l3.length, 0, null);
    }

    @Override
    public final void b0(org.telegram.messenger.ImageReceiver r4, boolean r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hg.b0(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public final void e(cf8 cf8Var, sw6 sw6Var) {
        cf8Var.p(((oz6) this.d).f(sw6Var, cf8Var, this.c), this.b);
    }

    @Override
    public final void invoke(Object obj) {
        uk ukVar = (uk) obj;
        ukVar.k((tk) this.d, this.c, this.b);
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        Object obj = this.d;
        int i2 = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                EditText editText = (EditText) obj;
                String str = "";
                if (j > 0) {
                    TLRPC.UserFull X1 = oc7.r1(i2).X1(z8c.h(i2).e());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (X1 != null) {
                        String str2 = X1.about;
                        if (str2 != null) {
                            str = str2;
                        }
                        if (str.equals(trim)) {
                            gm.t1(editText);
                            heVar.dismiss();
                            return;
                        }
                        X1.about = trim;
                        nm7.f(i2).k(68, Long.valueOf(j), X1);
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    nm7.e().k(297, 2, Long.valueOf(j));
                    ConnectionsManager.getInstance(i2).sendRequest(updateprofile, new nf2((byte) 0), 2);
                } else {
                    long j2 = -j;
                    TLRPC.ChatFull M0 = oc7.r1(i2).M0(j2);
                    String obj2 = editText.getText().toString();
                    if (M0 != null) {
                        String str3 = M0.about;
                        if (str3 != null) {
                            str = str3;
                        }
                        if (str.equals(obj2)) {
                            gm.t1(editText);
                            heVar.dismiss();
                            return;
                        }
                        M0.about = obj2;
                        nm7 f = nm7.f(i2);
                        Boolean bool = Boolean.FALSE;
                        f.k(31, M0, 0, bool, bool);
                    }
                    nm7.e().k(297, 2, Long.valueOf(j));
                    oc7 r1 = oc7.r1(i2);
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = r1.i1(-j2);
                    tL_messages_editChatAbout.about = obj2;
                    r1.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new i65(r1, M0, obj2, (byte) 21), 64);
                }
                heVar.dismiss();
                return;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = oc7.r1(z8c.t0).W3.edit();
                if (j != 0) {
                    edit.putInt("color_" + j, 0);
                } else if (i2 == 1) {
                    edit.putInt("MessagesLed", 0);
                } else if (i2 == 0) {
                    edit.putInt("GroupLed", 0);
                } else if (i2 == 3) {
                    edit.putInt("StoriesLed", 0);
                } else if (i2 != 5 && i2 != 4) {
                    edit.putInt("ChannelLed", 0);
                } else {
                    edit.putInt("ReactionsLed", 0);
                }
                edit.commit();
                runnable.run();
                return;
        }
    }

    @Override
    public final Object t(tx6 tx6Var, sw6 sw6Var, int i) {
        long j;
        try {
            mo5 a = e41.a((IBinder) this.d);
            jo5 p = mo5.p();
            for (int i2 = 0; i2 < a.size(); i2++) {
                Bundle bundle = (Bundle) a.get(i2);
                bundle.getClass();
                p.c(bt6.a(sw6Var.c, bundle));
            }
            y79 f = p.f();
            int i3 = this.c;
            if (i3 == -1) {
                tx6Var.t();
                i3 = tx6Var.t.l0();
                tx6Var.t();
                j = tx6Var.t.k();
            } else {
                j = this.b;
            }
            return tx6Var.o(sw6Var, f, i3, j);
        } catch (RuntimeException e) {
            ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            return kke.b(e);
        }
    }

    public hg(long j, int i, Object obj, byte b) {
        this.a = b;
        this.b = j;
        this.c = i;
        this.d = obj;
    }

    public hg(Object obj, int i, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.c = i;
        this.b = j;
    }

    public hg(Object obj, long j, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = i;
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override
    public final void B0(int i, Drawable drawable) {
    }
}
