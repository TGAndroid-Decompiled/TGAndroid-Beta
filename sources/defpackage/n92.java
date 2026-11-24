package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class n92 extends d implements jm7 {
    public final Paint E;
    public q7c F;
    public final ArrayList G;
    public final ArrayList H;
    public final LinkedHashMap I;
    public final ArrayList J;
    public final LinkedHashMap K;
    public final ArrayList L;
    public boolean M;
    public int N;
    public final int O;
    public boolean P;
    public boolean Q;
    public fn0 R;
    public final TLRPC.ChatFull S;
    public final long T;
    public int U;
    public int V;
    public TLRPC.Chat W;
    public TL_stories.TL_premium_boostsStatus X;
    public int Y;
    public int Z;
    public boolean a;
    public boolean a0;
    public l92 b;
    public final f92 b0;
    public yd c;
    public he0 d;
    public bjb e;
    public njb f;
    public k92 h;
    public jla n;
    public bjb r;
    public n8c s;
    public FrameLayout w;
    public ImageView x;
    public int y;

    public n92(long j, TLRPC.ChatFull chatFull) {
        super(null);
        this.E = new Paint();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new LinkedHashMap();
        this.J = new ArrayList();
        this.K = new LinkedHashMap();
        this.L = new ArrayList();
        this.O = getMessagesController().l4.S1.f();
        this.P = false;
        this.Z = -1;
        this.b0 = new f92(this, (byte) 6);
        this.T = j;
        this.S = chatFull;
    }

    public final void b0(View view, boolean z) {
        this.G.add(view);
        this.H.add(Boolean.valueOf(z));
    }

    public final void c0(gn gnVar) {
        Editable text = this.h.getText();
        Layout layout = this.h.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(gnVar)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            gn[] gnVarArr = (gn[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), gn.class);
            for (gn gnVar2 : gnVarArr) {
                gnVar2.setAnimateChanges();
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        if (d0(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final android.view.View createView(android.content.Context r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n92.createView(android.content.Context):android.view.View");
    }

    public final boolean d0(boolean z) {
        boolean z2 = !this.I.keySet().equals(this.K.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.Y) {
            z2 = false;
        }
        if (this.M != this.a) {
            z2 = true;
        }
        if (z && z2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M0 = jb6.M0(2131743522, "UnsavedChanges");
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131746140, "ReactionApplyChangesDialog");
            alertDialog$Builder.j(jb6.M0(2131754181, "ApplyTheme"), new ee(this) {
                public final n92 b;

                {
                    this.b = this;
                }

                @Override
                public final void r(he heVar2, int i) {
                    byte b = r2;
                    n92 n92Var = this.b;
                    switch (b) {
                        case 0:
                            n92Var.s.performClick();
                            return;
                        default:
                            n92Var.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.g(jb6.M0(2131751343, null), new ee(this) {
                public final n92 b;

                {
                    this.b = this;
                }

                @Override
                public final void r(he heVar2, int i) {
                    byte b = r2;
                    n92 n92Var = this.b;
                    switch (b) {
                        case 0:
                            n92Var.s.performClick();
                            return;
                        default:
                            n92Var.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.o();
        }
        return z2;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.y1 && ((Long) objArr[0]).longValue() == (-this.T)) {
            tk5 tk5Var = this.parentLayout;
            if (tk5Var != null && tk5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void e0(boolean z) {
        if (this.X == null) {
            return;
        }
        if (this.Z == 0) {
            this.Z = 1;
        }
        int size = h0(true).size();
        this.Y = size;
        if (this.X.level < size) {
            if (z) {
                c41.b0(this).Q(2131623982, 36, gm.S2(jb6.G(size, "ReactionReachLvlForReactionShort", Integer.valueOf(size)))).j();
            }
            this.s.setLvlRequiredState(this.Y);
            return;
        }
        this.s.g(null, true);
    }

    public final void f0() {
        if (this.P) {
            this.P = false;
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                this.F.setFocusableInTouchMode(true);
                this.F.requestFocus();
            } else {
                this.h.clearFocus();
            }
            nm7.e().k(nm7.j1, 512);
            this.c.setLayerType(2, null);
            this.R.a(false, true);
        }
    }

    public final boolean g0() {
        int editTextSelectionEnd = this.h.getEditTextSelectionEnd();
        int editTextSelectionStart = this.h.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h.getText());
        if (!this.h.hasSelection()) {
            return false;
        }
        gn[] gnVarArr = (gn[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, gn.class);
        for (gn gnVar : gnVarArr) {
            this.I.remove(Long.valueOf(gnVar.documentId));
            this.J.remove(Long.valueOf(gnVar.documentId));
            this.b.A(Long.valueOf(gnVar.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        e0(false);
        return true;
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.F;
    }

    public final ArrayList h0(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.J;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            Long l = (Long) obj;
            if (l.longValue() != -1) {
                ArrayList arrayList4 = this.L;
                int size2 = arrayList4.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        Object obj2 = arrayList4.get(i2);
                        i2++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                        if (l.longValue() == tL_availableReaction.activate_animation.id) {
                            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                            tL_reactionEmoji.emoticon = tL_availableReaction.reaction;
                            arrayList.add(tL_reactionEmoji);
                            break;
                        }
                    } else {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji.document_id = l.longValue();
                        arrayList.add(tL_reactionCustomEmoji);
                        arrayList2.add(tL_reactionCustomEmoji);
                        break;
                    }
                }
            }
        }
        if (z) {
            return arrayList2;
        }
        return arrayList;
    }

    public final void i0(int i, boolean z, boolean z2) {
        boolean z3;
        int i2;
        int i3;
        if (this.Z != i || this.a != z) {
            this.a = z;
            if (i != 1 && i != 0 && !z) {
                z3 = false;
            } else {
                z3 = true;
            }
            this.e.setChecked(z3);
            if (z3) {
                i2 = cmb.e6;
            } else {
                i2 = cmb.d6;
            }
            int w0 = cmb.w0(null, i2, false);
            bjb bjbVar = this.e;
            if (z2) {
                if (z3) {
                    bjbVar.b(w0, true);
                } else {
                    bjbVar.setBackgroundColorAnimatedReverse(w0);
                }
            } else {
                if (z3) {
                    i3 = cmb.e6;
                } else {
                    i3 = cmb.d6;
                }
                anb.h(i3, null, bjbVar);
            }
            this.Z = i;
            if (i != 1 && i != 0 && !z) {
                if (z2) {
                    f0();
                    this.w.animate().setListener(null).cancel();
                    this.w.animate().alpha(0.0f).setDuration(350L).setInterpolator(d53.f).setListener(new b91(this, (byte) 22)).start();
                    this.h.setFocusableInTouchMode(false);
                    this.F.g3.O(true);
                    return;
                }
                this.w.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.F.g3.O(false);
                return;
            }
            this.w.setVisibility(0);
            this.F.g3.O(z2);
            if (z2) {
                this.w.animate().setListener(null).cancel();
                this.w.animate().alpha(1.0f).setDuration(350L).setInterpolator(d53.f).start();
                this.F.post(new f92(this, (byte) 1));
                LinkedHashMap linkedHashMap = this.I;
                if (linkedHashMap.isEmpty()) {
                    this.b.L.clear();
                    this.h.setText("");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = this.L;
                    int size = arrayList.size();
                    int i4 = 0;
                    int i5 = 0;
                    while (i5 < size) {
                        int i6 = i5 + 1;
                        n39.a((TLRPC.TL_availableReaction) arrayList.get(i5), linkedHashMap, this.J, spannableStringBuilder, this.b, this.h.getFontMetricsInt());
                        i4++;
                        if (i4 >= this.O) {
                            break;
                        }
                        i5 = i6;
                    }
                    this.h.append(spannableStringBuilder);
                    this.h.J();
                    vy9 vy9Var = this.b.q0;
                    if (vy9Var != null) {
                        vy9Var.f();
                    }
                    e0(false);
                }
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(float f) {
        float a = pqe.a(f, 0.0f, 1.0f);
        yd ydVar = this.c;
        if (ydVar != null && this.w != null) {
            ydVar.setTranslationY((1.0f - a) * ydVar.getMeasuredHeight());
            this.w.setTranslationY((-a) * this.c.getMeasuredHeight());
        }
        l0();
        n0();
    }

    public final void k0() {
        bjb bjbVar = this.r;
        boolean z = bjbVar.e.h;
        int i = this.O;
        LinkedHashMap linkedHashMap = this.I;
        ArrayList arrayList = this.J;
        if (z) {
            bjbVar.setChecked(false);
            arrayList.remove((Object) (-1L));
            gn gnVar = (gn) linkedHashMap.remove(-1L);
            if (gnVar != null) {
                gnVar.setRemoved(new lx1(this, gnVar, (byte) 24));
            }
            c0(gnVar);
            this.b.x(-1L, true);
            e0(false);
            this.h.setMaxLength(i);
            i0(this.Z, this.a, true);
        } else {
            bjbVar.setChecked(true);
            try {
                this.h.setMaxLength(i + 1);
                SpannableString spannableString = new SpannableString("b");
                m92 m92Var = new m92(this);
                m92Var.cacheType = vm.f();
                m92Var.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, m92Var);
                spannableString.setSpan(m92Var, 0, spannableString.length(), 33);
                this.h.getText().insert(0, spannableString);
                this.b.x(-1L, true);
                e0(true);
                c0(m92Var);
            } catch (Exception e) {
                fc4.g(e, true);
            }
            i0(this.Z, true, true);
        }
        this.h.k(true);
    }

    public final void l0() {
        float f;
        if (this.w != null && this.s != null) {
            fn0 fn0Var = this.R;
            if (fn0Var != null) {
                f = fn0Var.e;
            } else {
                f = 0.0f;
            }
            int round = Math.round((1.0f - f) * this.y);
            ViewGroup.LayoutParams layoutParams = this.w.getLayoutParams();
            layoutParams.height = gm.L(74.0f) + round;
            this.w.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
            layoutParams2.bottomMargin = gm.L(13.0f) + round;
            this.s.setLayoutParams(layoutParams2);
        }
    }

    public final void m0() {
        if (this.c != null) {
            this.E.setColor(cmb.v0(cmb.c6, this.resourceProvider));
            this.c.setPadding(0, 0, 0, this.y);
            this.c.invalidate();
        }
    }

    public final void n0() {
        float f;
        if (this.F == null) {
            return;
        }
        fn0 fn0Var = this.R;
        if (fn0Var != null) {
            f = fn0Var.e;
        } else {
            f = 0.0f;
        }
        int U1 = gm.U1(f, gm.L(72.0f), gm.L(12.0f) + Math.max(0, this.c.getMeasuredHeight() - this.mSystemInsets.d));
        q7c q7cVar = this.F;
        iq5 iq5Var = this.mSystemInsets;
        eh0.e(q7cVar, iq5Var.b, iq5Var.d, a.getCurrentActionBarHeight(), U1);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.P) {
            if (z) {
                f0();
                return false;
            }
        } else if (!d0(z)) {
            return super.onBackPressed(z);
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        oc7 messagesController = getMessagesController();
        long j = this.T;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j));
        this.W = L0;
        if (L0 == null) {
            TLRPC.Chat O = cf7.Y(this.currentAccount).O(j);
            this.W = O;
            if (O != null) {
                getMessagesController().V3(this.W, true);
            }
            return false;
        }
        if (this.S != null) {
            getMessagesController().F0().a(-j, new g92(this, (byte) 0));
            getNotificationCenter().b(this, nm7.Z4);
            this.L.addAll(getMediaDataController().n);
            nm7.e().k(nm7.j1, 512);
            getNotificationCenter().b(this, nm7.y1);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        gm.r(this.b0);
        if (this.Z == 2 && (this.V != this.U || (this.N != 2 && !this.M && !this.a))) {
            getMessagesController().N4(this.T, this.Z, h0(false), this.V, null, null, null);
        }
        getNotificationCenter().n(this, nm7.Z4);
        getNotificationCenter().n(this, nm7.y1);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.y = i4;
        l0();
        m0();
        n0();
    }

    @Override
    public final void onPause() {
        this.a0 = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.a0) {
            this.a0 = false;
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            if (this.P) {
                this.h.K(false);
                gm.d3(new f92(this, (byte) 0), 250L);
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i;
        try {
            super.onThemeColorsChanged();
            bjb bjbVar = this.e;
            if (bjbVar != null && (bjbVar.getBackground() instanceof ColorDrawable)) {
                bjb bjbVar2 = this.e;
                if (bjbVar2.e.h) {
                    i = cmb.e6;
                } else {
                    i = cmb.d6;
                }
                bjbVar2.setBackgroundColor(cmb.w0(null, i, false));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z && this.Z != 2) {
            this.fragmentView.setFocusableInTouchMode(true);
            this.fragmentView.requestFocus();
            this.h.setFocusableInTouchMode(true);
        }
        if (z) {
            this.Q = true;
            if (!z2) {
                if (this.b == null) {
                    l92 l92Var = new l92(this, this, getParentActivity(), getResourceProvider(), cmb.v0(cmb.F6, getResourceProvider()));
                    this.b = l92Var;
                    l92Var.setAnimationsEnabled(false);
                    this.b.setClipChildren(false);
                    anb.h(cmb.c6, null, this.b);
                    this.c.addView(this.b, qoe.e(-1, -2, 80));
                    he0 he0Var = new he0(getParentActivity(), getResourceProvider());
                    this.d = he0Var;
                    he0Var.setOnBackspace(new g92(this, (byte) 1));
                    this.c.addView(this.d, qoe.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                    ArrayList arrayList = this.J;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        this.b.x((Long) obj, false);
                    }
                }
                gm.d3(new jd((byte) 22), 200L);
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
