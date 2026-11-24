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
public final class t37 extends FrameLayout implements tjb {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final hc0 d;
    public final jia e;
    public final int f;
    public final boolean h;
    public final pi4 n;
    public boolean r;
    public rkb s;
    public int w;

    public t37(Context context, int i, k27 k27Var, TLRPC.Chat chat) {
        super(context);
        boolean z;
        int i2;
        long j;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = i;
        if (!k27Var.g4() && !k27.Q4(k27Var.k)) {
            z = false;
        } else {
            z = true;
        }
        this.h = z;
        pi4 pi4Var = new pi4(context, null);
        this.n = pi4Var;
        pi4Var.e(bkb.F8, bkb.h6, -1);
        pi4Var.setViewType(13);
        pi4Var.setIsSingleCell(false);
        addView(pi4Var, nme.c(-1.0f, -2));
        jia jiaVar = new jia(context);
        this.e = jiaVar;
        jiaVar.setTextSize(16);
        jiaVar.setEllipsizeByGradient(true);
        jiaVar.setRightPadding(gl.L(62.0f));
        addView(jiaVar, nme.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        hc0 hc0Var = new hc0(context, false);
        this.d = hc0Var;
        hc0Var.setStyle(11);
        hc0Var.setAvatarsTextSize(gl.L(22.0f));
        addView(hc0Var, nme.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        zkb.W(jiaVar, bkb.D8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = k27Var.e1();
        tL_messages_getMessageReadParticipants.peer = na7.q1(i).h1(k27.B0(k27Var.k));
        ImageView imageView = new ImageView(context);
        addView(imageView, nme.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z) {
            i2 = 2131232303;
        } else {
            i2 = 2131232361;
        }
        Drawable mutate = context.getDrawable(i2).mutate();
        zkb.x(this, mutate, bkb.E8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        hc0Var.setAlpha(0.0f);
        jiaVar.setAlpha(0.0f);
        TLRPC.Peer peer = k27Var.k.from_id;
        if (peer != null) {
            j = peer.user_id;
        } else {
            j = 0;
        }
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getMessageReadParticipants, new tg(this, j, i, chat));
        int w0 = bkb.w0(null, bkb.H5, false);
        this.w = w0;
        setBackground(bkb.Y(w0, 6, 0));
        setEnabled(false);
    }

    public final o39 a() {
        rkb rkbVar = this.s;
        if (rkbVar != null) {
            return rkbVar;
        }
        rkb rkbVar2 = new rkb(getContext(), null, (byte) 9);
        this.s = rkbVar2;
        getContext();
        rkbVar2.setLayoutManager(new t26());
        this.s.i(new kr(this, (byte) 6));
        this.s.setAdapter(new gx0(this, (byte) 4));
        return this.s;
    }

    public final void b() {
        boolean z;
        hc0 hc0Var;
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
            hc0Var = this.d;
            if (i >= 3) {
                break;
            }
            int size = arrayList.size();
            int i2 = this.f;
            if (i < size) {
                hc0Var.b(i, i2, (TLObject) arrayList.get(i));
            } else {
                hc0Var.b(i, i2, null);
            }
            i++;
        }
        if (arrayList.size() == 1) {
            hc0Var.setTranslationX(gl.L(24.0f));
        } else if (arrayList.size() == 2) {
            hc0Var.setTranslationX(gl.L(12.0f));
        } else {
            hc0Var.setTranslationX(0.0f);
        }
        int L = gl.L((Math.min(2, arrayList.size() - 1) * 12) + 38);
        jia jiaVar = this.e;
        jiaVar.setRightPadding(L);
        hc0Var.a(false);
        ArrayList arrayList2 = this.a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            jiaVar.l(qu2.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            jiaVar.l(k96.M0(2131747932, null), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            jiaVar.l(k96.G(arrayList2.size(), str, new Object[0]), false);
        }
        jiaVar.animate().alpha(1.0f).setDuration(220L).start();
        hc0Var.animate().alpha(1.0f).setDuration(220L).start();
        pi4 pi4Var = this.n;
        pi4Var.animate().alpha(0.0f).setDuration(220L).setListener(new id4(pi4Var)).start();
        rkb rkbVar = this.s;
        if (rkbVar != null) {
            rkbVar.getAdapter();
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
        pi4 pi4Var = this.n;
        if (pi4Var.getVisibility() != 0) {
            z = false;
        }
        jia jiaVar = this.e;
        jiaVar.setVisibility(8);
        if (z) {
            pi4Var.setVisibility(8);
        }
        super.onMeasure(i, i2);
        if (z) {
            pi4Var.getLayoutParams().width = getMeasuredWidth();
            pi4Var.setVisibility(0);
        }
        jiaVar.setVisibility(0);
        jiaVar.getLayoutParams().width = getMeasuredWidth() - gl.L(40.0f);
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
            int w0 = bkb.w0(null, bkb.H5, false);
            if (getBackground() != null && w0 != this.w) {
                this.w = w0;
                bkb.F1(getBackground(), w0, true);
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
