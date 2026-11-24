package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
public abstract class n7c extends d {
    public va a;
    public p84 b;
    public int c;
    public int d;

    public n7c() {
        super(null);
        this.c = -1;
    }

    public void Z(java.util.ArrayList r9, defpackage.l7c r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7c.Z(java.util.ArrayList, l7c):void");
    }

    public CharSequence a0() {
        return jb6.M0(2131752678, null);
    }

    public void b0(c6c c6cVar, View view) {
        if (c6cVar.d == 1) {
            q51 d = q51.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.a).sendRequest(createbusinesschatlink, new o51(d, (byte) 1));
        } else if (c6cVar.a == 29) {
            Object obj = c6cVar.H;
            if (obj instanceof l51) {
                Bundle j = kt6.j(6, "chatMode");
                j.putString("business_link", ((l51) obj).a.link);
                presentFragment(new yv1(j));
            }
        }
    }

    public boolean c0(c6c c6cVar, View view) {
        return false;
    }

    @Override
    public View createView(Context context) {
        im8 im8Var = new im8(this, (byte) 24);
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            rjaVar.setBackButtonDrawable(new ee0(false));
            this.simpleActionBar.setTitle(a0());
            this.simpleActionBar.setActionBarMenuOnItemClick(im8Var);
        } else {
            this.actionBar.setBackButtonDrawable(new ee0(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(a0());
            this.actionBar.setActionBarMenuOnItemClick(im8Var);
        }
        this.b = new p84(context, null, (byte) 3);
        if (!useSimpleActionBar()) {
            anb.h(cmb.Z6, null, this.b);
        }
        va vaVar = new va(this, this, new o6b(this, (byte) 9), new m7c(this), new m7c(this));
        this.a = vaVar;
        this.b.addView(vaVar, qoe.c(-1.0f, -1));
        p84 p84Var = this.b;
        this.fragmentView = p84Var;
        return p84Var;
    }
}
