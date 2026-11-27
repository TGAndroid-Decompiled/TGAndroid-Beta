package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
public abstract class b8a extends n8 {
    public boolean A;
    public y7a B;
    public en9 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public v7a o;
    public TextView p;
    public boolean q;
    public TLRPC.Peer r;
    public TLRPC.TL_channels_sendAsPeers s;
    public d26 t;
    public View u;
    public d79 v;
    public x46 w;
    public Boolean x;
    public boolean y;
    public ArrayList z;

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        y7a y7aVar = this.B;
        if (y7aVar != null && y7aVar.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new wd8(this, (WindowManager) this.B.getContext().getSystemService("window"), (byte) 16));
        }
        this.A = true;
        d(true);
    }

    public final void k(List list, Context context, zu1 zu1Var, ie ieVar, View view, int i) {
        TLRPC.User X1;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i);
        if (!this.y) {
            if (tL_sendAsPeer.premium_required && !yac.h(yac.t0).p()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (this.B == null) {
                    this.B = new y7a(this, context);
                }
                en9 en9Var = this.C;
                if (en9Var != null) {
                    hl.r(en9Var);
                }
                if (this.B.getParent() == null) {
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    layoutParams.height = -1;
                    layoutParams.width = -1;
                    layoutParams.format = -3;
                    layoutParams.type = 99;
                    layoutParams.flags |= Integer.MIN_VALUE;
                    if (Build.VERSION.SDK_INT >= 28) {
                        layoutParams.layoutInDisplayCutoutMode = 1;
                    }
                    hl.s3(windowManager, this.B, layoutParams);
                    windowManager.addView(this.B, layoutParams);
                }
                if (zu1Var != null) {
                    y7a y7aVar = this.B;
                    xu1 xu1Var = zu1Var.Ba;
                    en9 en9Var2 = new en9(this, zu1Var, (byte) 26);
                    ?? h21Var = new h21(context, xu1Var);
                    Drawable drawable = context.getDrawable(2131232315);
                    de0 de0Var = h21Var.a;
                    de0Var.setImageDrawable(drawable);
                    int themedColor = h21Var.getThemedColor(aob.yj);
                    h21Var.c = themedColor;
                    de0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                    h21Var.b.setText(hl.S2(ob6.M0(2131745383, null)));
                    t21 t21Var = new t21(xu1Var, context, true);
                    t21Var.e(ob6.M0(2131745382, null));
                    t21Var.b = en9Var2;
                    h21Var.setButton(t21Var);
                    v21 f = v21.f(y7aVar, h21Var, 1500);
                    f.e.addCallback(new z7a(this, f));
                    f.j();
                }
                en9 en9Var3 = new en9(this, windowManager, (byte) 27);
                this.C = en9Var3;
                hl.d3(en9Var3, 2500L);
                return;
            }
            this.y = true;
            d79 d79Var = this.v;
            a8a a8aVar = (a8a) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) ieVar.b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) ieVar.c;
            uc7 uc7Var = (uc7) ieVar.d;
            int i2 = ChatActivityEnterView.X7;
            if (chatActivityEnterView.r0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.I2(true);
            xy1 xy1Var = chatActivityEnterView.O3;
            if (xy1Var == null || !xy1Var.H0(wf3.n(peer))) {
                long j = chatActivityEnterView.F3;
                long n = wf3.n(peer);
                TLRPC.ChatFull N0 = uc7Var.N0(-j);
                if (N0 != null) {
                    N0.default_send_as = uc7Var.y1(n);
                    uc7Var.getMessagesStorage().K1(N0, false);
                    uc7Var.getNotificationCenter().k(jn7.F, Long.valueOf(j), N0.default_send_as);
                }
                TLRPC.TL_messages_saveDefaultSendAs tL_messages_saveDefaultSendAs = new TLRPC.TL_messages_saveDefaultSendAs();
                tL_messages_saveDefaultSendAs.peer = uc7Var.j1(j);
                tL_messages_saveDefaultSendAs.send_as = uc7Var.j1(n);
                uc7Var.getConnectionsManager().sendRequest(tL_messages_saveDefaultSendAs, new e77(uc7Var, j, (byte) 16), 64);
            }
            int[] iArr = new int[2];
            wla wlaVar = a8aVar.a;
            boolean isSelected = wlaVar.isSelected();
            wlaVar.getLocationInWindow(iArr);
            wlaVar.a(true, true);
            wla wlaVar2 = new wla(chatActivityEnterView.getContext());
            long j2 = peer.channel_id;
            long j3 = 0;
            if (j2 != 0) {
                TLRPC.Chat M0 = uc7Var.M0(Long.valueOf(j2));
                if (M0 != null) {
                    wlaVar2.setAvatar(M0);
                }
            } else {
                long j4 = peer.user_id;
                if (j4 != 0 && (X1 = uc7Var.X1(Long.valueOf(j4))) != null) {
                    wlaVar2.setAvatar(X1);
                }
            }
            for (int i3 = 0; i3 < d79Var.getChildCount(); i3++) {
                View childAt = d79Var.getChildAt(i3);
                if ((childAt instanceof a8a) && childAt != a8aVar) {
                    ((a8a) childAt).a.a(false, true);
                }
            }
            ao1 ao1Var = new ao1(chatActivityEnterView, wlaVar2, iArr, a8aVar, (byte) 3);
            if (!isSelected) {
                j3 = 200;
            }
            hl.d3(ao1Var, j3);
        }
    }

    public final void l(vpa... vpaVarArr) {
        v7a v7aVar = this.o;
        d26 d26Var = this.t;
        ArrayList arrayList = this.z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((vpa) obj).d();
        }
        arrayList.clear();
        d26Var.setPivotX(hl.L(8.0f));
        d26Var.setPivotY(d26Var.getMeasuredHeight() - hl.L(8.0f));
        v7aVar.setPivotX(0.0f);
        v7aVar.setPivotY(0.0f);
        d26Var.setScaleX(1.0f);
        d26Var.setScaleY(1.0f);
        v7aVar.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        vpa vpaVar = new vpa(d26Var, vpa.q);
        vpaVar.m = bp1.j(0.25f, 750.0f, 1.0f);
        vpaVar.b(new qs3(this) {
            public final b8a b;

            {
                this.b = this;
            }

            @Override
            public final void a(vpa vpaVar2, float f, float f2) {
                byte b = r2;
                b8a b8aVar = this.b;
                switch (b) {
                    case 0:
                        b8aVar.o.setScaleX(1.0f / f);
                        return;
                    default:
                        b8aVar.o.setScaleY(1.0f / f);
                        return;
                }
            }
        });
        vpa vpaVar2 = new vpa(d26Var, vpa.r);
        vpaVar2.m = bp1.j(0.25f, 750.0f, 1.0f);
        boolean z = true;
        vpaVar2.b(new qs3(this) {
            public final b8a b;

            {
                this.b = this;
            }

            @Override
            public final void a(vpa vpaVar22, float f, float f2) {
                byte b = r2;
                b8a b8aVar = this.b;
                switch (b) {
                    case 0:
                        b8aVar.o.setScaleX(1.0f / f);
                        return;
                    default:
                        b8aVar.o.setScaleY(1.0f / f);
                        return;
                }
            }
        });
        os3 os3Var = vpa.v;
        vpa vpaVar3 = new vpa(d26Var, os3Var);
        vpaVar3.m = bp1.j(0.0f, 750.0f, 1.0f);
        vpa vpaVar4 = new vpa(v7aVar, os3Var);
        vpaVar4.m = bp1.j(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(vpaVar, vpaVar2, vpaVar3, vpaVar4));
        for (vpa vpaVar5 : vpaVarArr) {
            if (vpaVar5 != null) {
                arrayList3.add(vpaVar5);
            }
        }
        if (vpaVarArr.length <= 0) {
            z = false;
        }
        this.q = z;
        ((vpa) arrayList3.get(0)).a(new iw0(this, (byte) 8));
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            vpa vpaVar6 = (vpa) obj2;
            arrayList.add(vpaVar6);
            vpaVar6.a(new x11(this, vpaVar6, (byte) 6));
            vpaVar6.h();
        }
    }

    @Override
    public final void showAtLocation(View view, int i, int i2, int i3) {
        this.E = i2;
        this.F = i3;
        super.showAtLocation(view, i, i2, i3);
    }
}
