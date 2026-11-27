package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
public abstract class n9c extends e {
    public wa a;
    public b84 b;
    public int c;
    public int d;

    public n9c() {
        super(null);
        this.c = -1;
    }

    public void Y(java.util.ArrayList r9, defpackage.l9c r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n9c.Y(java.util.ArrayList, l9c):void");
    }

    public CharSequence Z() {
        return ob6.M0(2131752706, null);
    }

    public void a0(b8c b8cVar, View view) {
        if (b8cVar.d == 1) {
            r41 d = r41.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.a).sendRequest(createbusinesschatlink, new p41(d, (byte) 1));
        } else if (b8cVar.a == 29) {
            Object obj = b8cVar.H;
            if (obj instanceof m41) {
                Bundle j = qu6.j(6, "chatMode");
                j.putString("business_link", ((m41) obj).a.link);
                presentFragment(new zu1(j));
            }
        }
    }

    public boolean b0(b8c b8cVar, View view) {
        return false;
    }

    @Override
    public View createView(Context context) {
        rn8 rn8Var = new rn8(this, (byte) 25);
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null) {
            jlaVar.setBackButtonDrawable(new gd0(false));
            this.simpleActionBar.setTitle(Z());
            this.simpleActionBar.setActionBarMenuOnItemClick(rn8Var);
        } else {
            this.actionBar.setBackButtonDrawable(new gd0(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(Z());
            this.actionBar.setActionBarMenuOnItemClick(rn8Var);
        }
        this.b = new b84(context, null, (byte) 3);
        if (!useSimpleActionBar()) {
            yob.h(aob.a7, null, this.b);
        }
        wa waVar = new wa(this, this, new l8b(this, (byte) 9), new m9c(this), new m9c(this));
        this.a = waVar;
        this.b.addView(waVar, tre.c(-1.0f, -1));
        b84 b84Var = this.b;
        this.fragmentView = b84Var;
        return b84Var;
    }
}
