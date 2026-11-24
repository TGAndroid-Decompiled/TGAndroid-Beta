package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class gf8 extends fx0 {
    public static final pm L1 = new pm("placeholderAlpha", (byte) 9);
    public final Paint A1;
    public LinearGradient B1;
    public Matrix C1;
    public float D1;
    public float E1;
    public boolean F1;
    public final RectF G1;
    public final TLRPC.TL_messageMediaPoll H1;
    public boolean I1;
    public int J1;
    public int K1;
    public final af8 l1;
    public final cf8 m1;
    public final Drawable n1;
    public final View o1;
    public final x10 p1;
    public AnimatorSet q1;
    public final k27 r1;
    public final TLRPC.Poll s1;
    public final TLRPC.InputPeer t1;
    public final HashSet u1;
    public final HashMap v1;
    public final ArrayList w1;
    public final fm x1;
    public int y1;
    public final ArrayList z1;

    public gf8(Context context, int i, k27 k27Var, wjb wjbVar) {
        super(1, wjbVar, context, true);
        TLRPC.Message message;
        y0c y0cVar;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i2;
        int i3;
        int i4 = 1;
        this.u1 = new HashSet();
        this.v1 = new HashMap();
        this.w1 = new ArrayList();
        this.z1 = new ArrayList();
        this.A1 = new Paint(1);
        this.F1 = true;
        this.G1 = new RectF();
        this.a = i;
        this.x = true;
        K();
        this.r1 = k27Var;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) k27Var.k.media;
        this.H1 = tL_messageMediaPoll;
        this.s1 = tL_messageMediaPoll.poll;
        this.t1 = na7.q1(this.a).h1(k27.B0(k27Var.k));
        ArrayList arrayList = new ArrayList();
        int size = tL_messageMediaPoll.results.results.size();
        Integer[] numArr = new Integer[size];
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                break;
            }
            TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i5);
            if (pollAnswerVoters.voters == 0) {
                i2 = i4;
            } else {
                TLRPC.TL_messages_votesList tL_messages_votesList = new TLRPC.TL_messages_votesList();
                int i6 = pollAnswerVoters.voters;
                i6 = i6 > 15 ? 10 : i6;
                int i7 = 0;
                while (i7 < i6) {
                    tL_messages_votesList.votes.add(new TLRPC.TL_messagePeerVoteInputOption());
                    i7++;
                    i4 = i4;
                }
                i2 = i4;
                int i8 = pollAnswerVoters.voters;
                tL_messages_votesList.next_offset = i6 < i8 ? "empty" : null;
                tL_messages_votesList.count = i8;
                this.w1.add(new ff8(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.t1;
                tL_messages_getPollVotes.id = this.r1.e1();
                if (pollAnswerVoters.voters <= 15) {
                    i3 = 15;
                } else {
                    i3 = 10;
                }
                tL_messages_getPollVotes.limit = i3;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getPollVotes, new vt0(this, numArr, i5, arrayList, pollAnswerVoters, (byte) 10)));
                numArr[i5] = valueOf;
                this.z1.add(valueOf);
            }
            i5++;
            i4 = i2;
        }
        F0();
        Collections.sort(this.w1, new ze8(this));
        H0();
        Drawable mutate = context.getResources().getDrawable(2131232733).mutate();
        this.n1 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(bkb.w0(null, bkb.h5, false), PorterDuff.Mode.MULTIPLY));
        oi3 oi3Var = new oi3(this, context);
        this.b = oi3Var;
        oi3Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i9 = this.u0;
        viewGroup.setPadding(i9, 0, i9, 0);
        af8 af8Var = new af8(this, context);
        this.l1 = af8Var;
        af8Var.setSections(false);
        gb3 gb3Var = new gb3();
        gb3Var.c = (short) 150;
        gb3Var.e = (short) 350;
        gb3Var.f = (short) 0;
        gb3Var.g = (short) 0;
        gb3Var.d = (short) 0;
        gb3Var.C = false;
        gb3Var.i = new OvershootInterpolator(1.1f);
        gb3Var.o = s33.h;
        af8Var.setItemAnimator(gb3Var);
        af8Var.setClipToPadding(false);
        getContext();
        af8Var.setLayoutManager(new zr((byte) 12, i4, false));
        af8Var.setHorizontalScrollBarEnabled(false);
        af8Var.setVerticalScrollBarEnabled(false);
        af8Var.setSectionsType(2);
        this.b.addView(af8Var, nme.e(-1, -1, 51));
        cf8 cf8Var = new cf8(this, context);
        this.m1 = cf8Var;
        af8Var.setAdapter(cf8Var);
        zkb.l(af8Var, 21, bkb.z5, null);
        af8Var.setOnItemClickListener(new k0(this, context, (byte) 18));
        af8Var.setOnScrollListener(new n58(this, (byte) 2));
        fm fmVar = new fm(context);
        this.x1 = fmVar;
        fmVar.setTextSize(1, 18.0f);
        fmVar.setTypeface(gl.o());
        fmVar.setPadding(gl.L(21.0f), gl.L(5.0f), gl.L(14.0f), gl.L(21.0f));
        int i10 = bkb.i5;
        zkb.X(fmVar, i10, null);
        fmVar.setTag(-33024);
        fmVar.setLayoutParams(new e49(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.s1.question;
        if (tL_textWithEntities2 != null) {
            k27 k27Var2 = this.r1;
            if (k27Var2 != null && k27Var2.L2 && (message = k27Var2.k) != null && (y0cVar = message.translatedPoll) != null && (tL_textWithEntities = y0cVar.a) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            kk7.i(fmVar);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            hq6.h(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder, -1);
            CharSequence m = vu3.m(spannableStringBuilder, fmVar.getPaint().getFontMetricsInt(), false, null, 0);
            k27.A5(m, tL_textWithEntities2.entities, fmVar.getPaint().getFontMetricsInt(), false);
            fmVar.setText(m);
        }
        x10 x10Var = new x10((byte) 4, context, this);
        this.p1 = x10Var;
        zkb.h(bkb.g5, null, x10Var);
        x10Var.setBackButtonImage(2131231243);
        zkb.l(x10Var, 1, i10, null);
        zkb.l(x10Var, 3, bkb.H5, null);
        zkb.l(x10Var, 5, i10, null);
        zkb.l(x10Var, 6, bkb.Fj, null);
        x10Var.setOccupyStatusBar(false);
        x10Var.setAlpha(0.0f);
        x10Var.setTitle(k96.M0(2131746968, null));
        boolean z = this.s1.quiz;
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (z) {
            x10Var.setSubtitle(k96.G(pollResults.total_voters, "Answer", new Object[0]));
        } else {
            x10Var.setSubtitle(k96.G(pollResults.total_voters, "Vote", new Object[0]));
        }
        this.b.addView(x10Var, nme.c(-2.0f, -1));
        x10Var.setActionBarMenuOnItemClick(new bq5(this, (byte) 22));
        View view = new View(context);
        this.o1 = view;
        view.setAlpha(0.0f);
        zkb.h(bkb.U5, null, view);
        this.b.addView(view, nme.c(1.0f, -1));
    }

    @Override
    public final void A(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.d7));
        hashSet.add(Integer.valueOf(bkb.e7));
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final void D0(View view) {
        af8 af8Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i = -2;
        while (true) {
            af8Var = this.l1;
            int i2 = 0;
            if (i >= af8Var.getChildCount()) {
                break;
            }
            if (i == -2) {
                childAt = view;
            } else if (i == -1) {
                childAt = af8Var.getPinnedHeader();
            } else {
                childAt = af8Var.getChildAt(i);
            }
            if ((childAt instanceof ef8) && (childAt.getTag(2131296587) instanceof ff8)) {
                ef8 ef8Var = (ef8) childAt;
                ff8 ff8Var = (ff8) childAt.getTag(2131296587);
                TLRPC.Poll poll = this.s1;
                int size = poll.answers.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i3);
                        if (Arrays.equals(pollAnswer.option, ff8Var.d) && ((df8) this.v1.get(ff8Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            k27 k27Var = this.r1;
                            if (k27Var != null && k27Var.L2 && (message = k27Var.k) != null && message.translatedPoll != null) {
                                while (true) {
                                    if (i2 >= k27Var.k.translatedPoll.b.size()) {
                                        break;
                                    }
                                    TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) k27Var.k.translatedPoll.b.get(i2);
                                    if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                                        tL_textWithEntities = pollAnswer2.text;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            if (tL_textWithEntities == null) {
                                str = "";
                                arrayList = null;
                            } else {
                                str = tL_textWithEntities.text;
                                arrayList = tL_textWithEntities.entities;
                            }
                            ef8Var.a(str, arrayList, E0(ff8Var.d), ff8Var.a, ff8Var.a(), true);
                            ef8Var.setTag(2131296587, ff8Var);
                        } else {
                            i3++;
                        }
                    }
                }
            }
            i++;
        }
        View view2 = af8Var.q1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(af8Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(af8Var.getMeasuredHeight(), 0));
            View view3 = af8Var.q1;
            view3.layout(0, 0, view3.getMeasuredWidth(), af8Var.q1.getMeasuredHeight());
            af8Var.invalidate();
        }
        af8Var.invalidate();
    }

    public final int E0(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.w1;
            if (i >= arrayList.size()) {
                break;
            }
            ff8 ff8Var = (ff8) arrayList.get(i);
            if (ff8Var != null) {
                i2 += ff8Var.a;
                if (Arrays.equals(ff8Var.d, bArr)) {
                    i3 += ff8Var.a;
                }
            }
            i++;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = this.H1;
        if (tL_messageMediaPoll.poll.multiple_choice) {
            i2 = tL_messageMediaPoll.results.total_voters;
        }
        if (i2 <= 0) {
            return 0;
        }
        return Math.round((i3 / i2) * 100.0f);
    }

    public final void F0() {
        HashMap hashMap = this.v1;
        hashMap.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.r1.k.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.w1;
        int size = arrayList2.size();
        int i = 100;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ff8 ff8Var = (ff8) arrayList2.get(i3);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap.put(ff8Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size2) {
                        TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i4);
                        if (Arrays.equals(ff8Var.d, pollAnswerVoters.option)) {
                            float f = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                            int i5 = (int) f;
                            obj.a = f - i5;
                            if (i2 == 0) {
                                i2 = i5;
                            } else if (i5 != 0 && i2 != i5) {
                                z = true;
                            }
                            i -= i5;
                        } else {
                            i4++;
                        }
                    }
                }
            }
        }
        if (z && i != 0) {
            Collections.sort(arrayList, new fx7((byte) 3));
            int min = Math.min(i, arrayList.size());
            for (int i6 = 0; i6 < min; i6++) {
                ((df8) arrayList.get(i6)).getClass();
            }
        }
    }

    public final void G0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf8.G0():void");
    }

    public final void H0() {
        Paint paint = this.A1;
        if (paint == null) {
            return;
        }
        int w0 = bkb.w0(null, bkb.g5, false);
        int w02 = bkb.w0(null, bkb.h5, false);
        int w03 = gl.w0(w02, w0);
        paint.setColor(w02);
        float L = gl.L(500.0f);
        this.E1 = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{w02, w03, w02}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.B1 = linearGradient;
        paint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.C1 = matrix;
        this.B1.setLocalMatrix(matrix);
    }

    @Override
    public final void I() {
        ArrayList arrayList = this.z1;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConnectionsManager.getInstance(this.a).cancelRequest(((Integer) arrayList.get(i)).intValue(), true);
        }
        super.I();
    }

    @Override
    public final ArrayList S() {
        ArrayList arrayList = new ArrayList();
        t00 t00Var = new t00(this, (byte) 13);
        arrayList.add(new blb(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.yj));
        ViewGroup viewGroup = this.b;
        Drawable[] drawableArr = {this.n1};
        int i = bkb.g5;
        arrayList.add(new blb(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (alb) null, i));
        arrayList.add(new blb(this.p1, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.i5));
        af8 af8Var = this.l1;
        arrayList.add(new blb(af8Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, t00Var, i));
        arrayList.add(new blb(af8Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, t00Var, bkb.h5));
        arrayList.add(new blb(af8Var, 0, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.p6));
        arrayList.add(new blb(af8Var, 0, new Class[]{wgb.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, bkb.M6));
        return arrayList;
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            int w0 = bkb.w0(null, bkb.h5, false);
            int w02 = bkb.w0(null, bkb.g5, false);
            if (this.I1 && w0 == this.J1 && w02 == this.K1) {
                return;
            }
            this.I1 = true;
            this.J1 = w0;
            this.K1 = w02;
            Drawable drawable = this.n1;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY));
            }
            H0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
