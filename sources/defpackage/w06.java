package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class w06 implements Runnable {
    public final LaunchActivity a;
    public final d b;
    public final int c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp e;
    public final AtomicBoolean f;
    public final String h;
    public final boolean n;
    public final boolean r;
    public final boolean s;
    public final boolean w;

    public w06(LaunchActivity launchActivity, d dVar, int i, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = launchActivity;
        this.b = dVar;
        this.c = i;
        this.d = user;
        this.e = tL_messages_botApp;
        this.f = atomicBoolean;
        this.h = str;
        this.n = z;
        this.r = z2;
        this.s = z3;
        this.w = z4;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String a0;
        String str = LaunchActivity.C1;
        d dVar = this.b;
        if (dVar != null && LaunchActivity.E1) {
            LaunchActivity launchActivity = this.a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j = user.id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z = this.f.get();
                int i = this.c;
                String str2 = this.h;
                boolean z2 = this.n;
                boolean z3 = this.r;
                rwc b = rwc.b(i, j, j, null, null, 3, 0, 0L, botApp, z, str2, user, 0, z2, z3);
                if (launchActivity.O() == null || launchActivity.O().l(b) == null) {
                    ewe.c(launchActivity.P, user.id);
                    wx0 wx0Var = new wx0(launchActivity, dVar.getResourceProvider());
                    ox0 ox0Var = wx0Var.E;
                    if (ox0Var != null) {
                        ox0Var.setWasOpenedByLinkIntent(this.s);
                    }
                    wx0Var.B(!z2);
                    if (z3) {
                        wx0Var.C(true, false, wx0Var.g0);
                    }
                    wx0Var.C0 = false;
                    wx0Var.m0 = launchActivity;
                    wx0Var.x(dVar, b);
                    wx0Var.show();
                    if (tL_messages_botApp.inactive || this.w) {
                        TLRPC.User W1 = oc7.r1(wx0Var.I).W1(Long.valueOf(wx0Var.J));
                        ArrayList<TLRPC.TL_attachMenuBot> arrayList = hs6.d0(wx0Var.I).b.bots;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i2);
                                i2++;
                                tL_attachMenuBot = tL_attachMenuBot2;
                                if (tL_attachMenuBot.bot_id == wx0Var.J) {
                                    break;
                                }
                            } else {
                                tL_attachMenuBot = null;
                                break;
                            }
                        }
                        if (tL_attachMenuBot != null) {
                            if (tL_attachMenuBot.show_in_side_menu) {
                                if (tL_attachMenuBot.show_in_attach_menu) {
                                    a0 = jb6.a0(null, null, 2131753103, W1.first_name);
                                } else {
                                    a0 = jb6.a0(null, null, 2131753102, W1.first_name);
                                }
                            } else {
                                a0 = jb6.a0(null, null, 2131753104, W1.first_name);
                            }
                            gm.d3(new x30(wx0Var, a0, (byte) 23), 200L);
                        }
                    }
                }
            }
        }
    }
}
