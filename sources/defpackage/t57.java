package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t57 extends FrameLayout implements vlb {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final hd0 d;
    public final lka e;
    public final int f;
    public final boolean h;
    public final tk4 n;
    public boolean r;
    public smb s;
    public int w;

    public t57(Context context, int i, k47 k47Var, TLRPC.Chat chat) {
        super(context);
        boolean z;
        int i2;
        long j;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = i;
        if (!k47Var.g4() && !k47.Q4(k47Var.k)) {
            z = false;
        } else {
            z = true;
        }
        this.h = z;
        tk4 tk4Var = new tk4(context, null);
        this.n = tk4Var;
        tk4Var.e(cmb.F8, cmb.h6, -1);
        tk4Var.setViewType(13);
        tk4Var.setIsSingleCell(false);
        addView(tk4Var, qoe.c(-1.0f, -2));
        lka lkaVar = new lka(context);
        this.e = lkaVar;
        lkaVar.setTextSize(16);
        lkaVar.setEllipsizeByGradient(true);
        lkaVar.setRightPadding(gm.L(62.0f));
        addView(lkaVar, qoe.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        hd0 hd0Var = new hd0(context, false);
        this.d = hd0Var;
        hd0Var.setStyle(11);
        hd0Var.setAvatarsTextSize(gm.L(22.0f));
        addView(hd0Var, qoe.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        anb.W(lkaVar, cmb.D8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = k47Var.e1();
        tL_messages_getMessageReadParticipants.peer = oc7.r1(i).i1(k47.B0(k47Var.k));
        ImageView imageView = new ImageView(context);
        addView(imageView, qoe.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z) {
            i2 = 2131232304;
        } else {
            i2 = 2131232362;
        }
        Drawable mutate = context.getDrawable(i2).mutate();
        anb.x(this, mutate, cmb.E8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        hd0Var.setAlpha(0.0f);
        lkaVar.setAlpha(0.0f);
        TLRPC.Peer peer = k47Var.k.from_id;
        if (peer != null) {
            j = peer.user_id;
        } else {
            j = 0;
        }
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getMessageReadParticipants, new mh(this, j, i, chat));
        int w0 = cmb.w0(null, cmb.H5, false);
        this.w = w0;
        setBackground(cmb.Y(w0, 6, 0));
        setEnabled(false);
    }

    public final r59 a() {
        smb smbVar = this.s;
        if (smbVar != null) {
            return smbVar;
        }
        smb smbVar2 = new smb(getContext(), null, (byte) 9);
        this.s = smbVar2;
        getContext();
        smbVar2.setLayoutManager(new u46());
        this.s.i(new ks(this, (byte) 6));
        this.s.setAdapter(new ny0(this, (byte) 4));
        return this.s;
    }

    public final void b() {
        boolean z;
        hd0 hd0Var;
        String str;
        ArrayList arrayList = this.c;
        if (arrayList.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        setEnabled(z);
        int i = 0;
        while (true) {
            hd0Var = this.d;
            if (i >= 3) {
                break;
            }
            int size = arrayList.size();
            int i2 = this.f;
            if (i < size) {
                hd0Var.b(i, i2, (TLObject) arrayList.get(i));
            } else {
                hd0Var.b(i, i2, null);
            }
            i++;
        }
        if (arrayList.size() == 1) {
            hd0Var.setTranslationX(gm.L(24.0f));
        } else if (arrayList.size() == 2) {
            hd0Var.setTranslationX(gm.L(12.0f));
        } else {
            hd0Var.setTranslationX(0.0f);
        }
        int L = gm.L((Math.min(2, arrayList.size() - 1) * 12) + 38);
        lka lkaVar = this.e;
        lkaVar.setRightPadding(L);
        hd0Var.a(false);
        ArrayList arrayList2 = this.a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            lkaVar.l(bw2.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            lkaVar.l(jb6.M0(2131747858, null), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            lkaVar.l(jb6.G(arrayList2.size(), str, new Object[0]), false);
        }
        lkaVar.animate().alpha(1.0f).setDuration(220L).start();
        hd0Var.animate().alpha(1.0f).setDuration(220L).start();
        tk4 tk4Var = this.n;
        tk4Var.animate().alpha(0.0f).setDuration(220L).setListener(new jf4(tk4Var)).start();
        smb smbVar = this.s;
        if (smbVar != null) {
            smbVar.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z = true;
        this.r = true;
        tk4 tk4Var = this.n;
        if (tk4Var.getVisibility() != 0) {
            z = false;
        }
        lka lkaVar = this.e;
        lkaVar.setVisibility(8);
        if (z) {
            tk4Var.setVisibility(8);
        }
        super.onMeasure(i, i2);
        if (z) {
            tk4Var.getLayoutParams().width = getMeasuredWidth();
            tk4Var.setVisibility(0);
        }
        lkaVar.setVisibility(0);
        lkaVar.getLayoutParams().width = getMeasuredWidth() - gm.L(40.0f);
        this.r = false;
        super.onMeasure(i, i2);
    }

    @Override
    public final void requestLayout() {
        if (this.r) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int w0 = cmb.w0(null, cmb.H5, false);
            if (getBackground() != null && w0 != this.w) {
                this.w = w0;
                cmb.F1(getBackground(), w0, true);
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
