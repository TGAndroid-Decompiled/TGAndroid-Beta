package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
public abstract class n5c extends d {
    public va a;
    public g74 b;
    public int c;
    public int d;

    public n5c() {
        super(null);
        this.c = -1;
    }

    public void Y(java.util.ArrayList r9, defpackage.l5c r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n5c.Y(java.util.ArrayList, l5c):void");
    }

    public CharSequence Z() {
        return k96.M0(2131752713, null);
    }

    public void a0(c4c c4cVar, View view) {
        if (c4cVar.d == 1) {
            j41 d = j41.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.a).sendRequest(createbusinesschatlink, new h41(d, (byte) 1));
        } else if (c4cVar.a == 29) {
            Object obj = c4cVar.H;
            if (obj instanceof e41) {
                Bundle j = ls6.j(6, "chatMode");
                j.putString("business_link", ((e41) obj).a.link);
                presentFragment(new mu1(j));
            }
        }
    }

    public boolean b0(c4c c4cVar, View view) {
        return false;
    }

    @Override
    public View createView(Context context) {
        kk8 kk8Var = new kk8(this, (byte) 23);
        pha phaVar = this.simpleActionBar;
        if (phaVar != null) {
            phaVar.setBackButtonDrawable(new ed0(false));
            this.simpleActionBar.setTitle(Z());
            this.simpleActionBar.setActionBarMenuOnItemClick(kk8Var);
        } else {
            this.actionBar.setBackButtonDrawable(new ed0(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(Z());
            this.actionBar.setActionBarMenuOnItemClick(kk8Var);
        }
        this.b = new g74(context, null, (byte) 3);
        if (!useSimpleActionBar()) {
            zkb.h(bkb.Z6, null, this.b);
        }
        va vaVar = new va(this, this, new n4b(this, (byte) 9), new m5c(this), new m5c(this));
        this.a = vaVar;
        this.b.addView(vaVar, nme.c(-1.0f, -1));
        g74 g74Var = this.b;
        this.fragmentView = g74Var;
        return g74Var;
    }
}
