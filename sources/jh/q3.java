package jh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.mc;
import org.telegram.ui.x21;

public final class q3 implements View.OnClickListener {

    public final int f13851a;

    public final x3 f13852b;

    public final org.telegram.ui.ActionBar.c6 f13853c;
    public final i9 d;

    public q3(x3 x3Var, i9 i9Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f13851a = 0;
        this.f13852b = x3Var;
        this.d = i9Var;
        this.f13853c = c6Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f13851a;
        org.telegram.ui.ActionBar.c6 c6Var = this.f13853c;
        int i11 = 1;
        i9 i9Var = this.d;
        x3 x3Var = this.f13852b;
        switch (i10) {
            case 0:
                e4 e4Var = x3Var.f14128l;
                i9Var.f13482g1 = true;
                i9Var.P();
                int i12 = e4Var.f13296y2;
                Context context = e4Var.getContext();
                TL_stories.StoryItem storyItem = e4Var.K1.f13141a;
                j3 j3Var = e4Var.Y0;
                org.telegram.ui.ActionBar.c6 c6Var2 = this.f13853c;
                mc mcVar = new mc(j3Var, c6Var2);
                ag.n0 n0Var = new ag.n0(i9Var, 21);
                int i13 = x21.v;
                x21.K(i12, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.f22617id))), mcVar, c6Var2, new byte[0], null, n0Var);
                x3 x3Var2 = e4Var.f13261p1;
                if (x3Var2 != null) {
                    x3Var2.a();
                }
                break;
            case 1:
                e4 e4Var2 = x3Var.f14128l;
                x3 x3Var3 = e4Var2.f13261p1;
                c4 c4Var = e4Var2.K1;
                if (x3Var3 != null) {
                    x3Var3.a();
                }
                lh.q9 q9Var = new lh.q9(e4Var2.getContext(), 86400, c6Var);
                q9Var.o1();
                q9Var.p1(MessagesController.getInstance(e4Var2.f13296y2).getInputPeer(e4Var2.f13291x1));
                q9Var.H = true;
                View[] viewPages = q9Var.f16593b.getViewPages();
                View view2 = viewPages[0];
                if (view2 instanceof lh.k9) {
                    lh.k9 k9Var = (lh.k9) view2;
                    k9Var.b(k9Var.f16249a);
                }
                View view3 = viewPages[1];
                if (view3 instanceof lh.k9) {
                    lh.k9 k9Var2 = (lh.k9) view3;
                    k9Var2.b(k9Var2.f16249a);
                }
                q9Var.e1(false);
                q9Var.m1(1);
                q9Var.k1(false);
                d1 d1Var = i9Var.f13512w0;
                if (d1Var == null) {
                    z10 = false;
                } else {
                    TLRPC.GroupCall groupCall = d1Var.v;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                boolean zD = c4Var.d();
                TL_stories.StoryItem storyItem2 = c4Var.f13141a;
                boolean z11 = storyItem2 != null && storyItem2.pinned;
                d1 d1Var2 = i9Var.f13512w0;
                int iJ = d1Var2 == null ? 0 : (int) d1Var2.j();
                q9Var.f16600w = z10;
                q9Var.f16601x = zD;
                q9Var.f16602y = z11;
                q9Var.D = iJ;
                View[] viewPages2 = q9Var.f16593b.getViewPages();
                View view4 = viewPages2[0];
                if (view4 instanceof lh.k9) {
                    lh.k9 k9Var3 = (lh.k9) view4;
                    k9Var3.b(k9Var3.f16249a);
                }
                View view5 = viewPages2[1];
                if (view5 instanceof lh.k9) {
                    lh.k9 k9Var4 = (lh.k9) view5;
                    k9Var4.b(k9Var4.f16249a);
                }
                q9Var.P = new z1(i11, x3Var, q9Var);
                q9Var.show();
                break;
            default:
                e4 e4Var3 = x3Var.f14128l;
                x3 x3Var4 = e4Var3.f13261p1;
                if (x3Var4 != null) {
                    x3Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e4Var3.getContext(), 0, c6Var);
                String string = LocaleController.getString(R.string.LiveStoryEndAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                b2Var.N = string;
                b2Var.P = LocaleController.getString(R.string.LiveStoryEndAlertText);
                alertDialog$Builder.k(LocaleController.getString(R.string.LiveStoryEndAlertButton), new z1(2, x3Var, i9Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
        }
    }

    public q3(x3 x3Var, org.telegram.ui.ActionBar.c6 c6Var, i9 i9Var, int i10) {
        this.f13851a = i10;
        this.f13852b = x3Var;
        this.f13853c = c6Var;
        this.d = i9Var;
    }
}
