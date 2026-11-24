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
public final class ih8 extends my0 {
    public static final pn L1 = new pn("placeholderAlpha", (byte) 9);
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
    public final ch8 l1;
    public final eh8 m1;
    public final Drawable n1;
    public final View o1;
    public final x20 p1;
    public AnimatorSet q1;
    public final k47 r1;
    public final TLRPC.Poll s1;
    public final TLRPC.InputPeer t1;
    public final HashSet u1;
    public final HashMap v1;
    public final ArrayList w1;
    public final fn x1;
    public int y1;
    public final ArrayList z1;

    public ih8(Context context, int i, k47 k47Var, ylb ylbVar) {
        super(1, ylbVar, context, true);
        TLRPC.Message message;
        y2c y2cVar;
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
        J();
        this.r1 = k47Var;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) k47Var.k.media;
        this.H1 = tL_messageMediaPoll;
        this.s1 = tL_messageMediaPoll.poll;
        this.t1 = oc7.r1(this.a).i1(k47.B0(k47Var.k));
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
                this.w1.add(new hh8(tL_messages_votesList, pollAnswerVoters.option));
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
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getPollVotes, new ev0(this, numArr, i5, arrayList, pollAnswerVoters, (byte) 10)));
                numArr[i5] = valueOf;
                this.z1.add(valueOf);
            }
            i5++;
            i4 = i2;
        }
        F0();
        Collections.sort(this.w1, new bh8(this));
        H0();
        Drawable mutate = context.getResources().getDrawable(2131232745).mutate();
        this.n1 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(cmb.w0(null, cmb.h5, false), PorterDuff.Mode.MULTIPLY));
        yj3 yj3Var = new yj3(this, context);
        this.b = yj3Var;
        yj3Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i9 = this.u0;
        viewGroup.setPadding(i9, 0, i9, 0);
        ch8 ch8Var = new ch8(this, context);
        this.l1 = ch8Var;
        ch8Var.setSections(false);
        sc3 sc3Var = new sc3();
        sc3Var.c = (short) 150;
        sc3Var.e = (short) 350;
        sc3Var.f = (short) 0;
        sc3Var.g = (short) 0;
        sc3Var.d = (short) 0;
        sc3Var.C = false;
        sc3Var.i = new OvershootInterpolator(1.1f);
        sc3Var.o = d53.h;
        ch8Var.setItemAnimator(sc3Var);
        ch8Var.setClipToPadding(false);
        getContext();
        ch8Var.setLayoutManager(new zs((byte) 12, i4, false));
        ch8Var.setHorizontalScrollBarEnabled(false);
        ch8Var.setVerticalScrollBarEnabled(false);
        ch8Var.setSectionsType(2);
        this.b.addView(ch8Var, qoe.e(-1, -1, 51));
        eh8 eh8Var = new eh8(this, context);
        this.m1 = eh8Var;
        ch8Var.setAdapter(eh8Var);
        anb.l(ch8Var, 21, cmb.z5, null);
        ch8Var.setOnItemClickListener(new k0(this, context, (byte) 18));
        ch8Var.setOnScrollListener(new so7(this, (byte) 3));
        fn fnVar = new fn(context);
        this.x1 = fnVar;
        fnVar.setTextSize(1, 18.0f);
        fnVar.setTypeface(gm.o());
        fnVar.setPadding(gm.L(21.0f), gm.L(5.0f), gm.L(14.0f), gm.L(21.0f));
        int i10 = cmb.i5;
        anb.X(fnVar, i10, null);
        fnVar.setTag(-33024);
        fnVar.setLayoutParams(new g69(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.s1.question;
        if (tL_textWithEntities2 != null) {
            k47 k47Var2 = this.r1;
            if (k47Var2 != null && k47Var2.L2 && (message = k47Var2.k) != null && (y2cVar = message.translatedPoll) != null && (tL_textWithEntities = y2cVar.a) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            nm7.i(fnVar);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            hs6.h(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder, -1);
            CharSequence m = gw3.m(spannableStringBuilder, fnVar.getPaint().getFontMetricsInt(), false, null, 0);
            k47.A5(m, tL_textWithEntities2.entities, fnVar.getPaint().getFontMetricsInt(), false);
            fnVar.setText(m);
        }
        x20 x20Var = new x20((byte) 4, context, this);
        this.p1 = x20Var;
        anb.h(cmb.g5, null, x20Var);
        x20Var.setBackButtonImage(2131231244);
        anb.l(x20Var, 1, i10, null);
        anb.l(x20Var, 3, cmb.H5, null);
        anb.l(x20Var, 5, i10, null);
        anb.l(x20Var, 6, cmb.Fj, null);
        x20Var.setOccupyStatusBar(false);
        x20Var.setAlpha(0.0f);
        x20Var.setTitle(jb6.M0(2131746894, null));
        boolean z = this.s1.quiz;
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (z) {
            x20Var.setSubtitle(jb6.G(pollResults.total_voters, "Answer", new Object[0]));
        } else {
            x20Var.setSubtitle(jb6.G(pollResults.total_voters, "Vote", new Object[0]));
        }
        this.b.addView(x20Var, qoe.c(-2.0f, -1));
        x20Var.setActionBarMenuOnItemClick(new wl5(this, (byte) 23));
        View view = new View(context);
        this.o1 = view;
        view.setAlpha(0.0f);
        anb.h(cmb.U5, null, view);
        this.b.addView(view, qoe.c(1.0f, -1));
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final void D0(View view) {
        ch8 ch8Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i = -2;
        while (true) {
            ch8Var = this.l1;
            int i2 = 0;
            if (i >= ch8Var.getChildCount()) {
                break;
            }
            if (i == -2) {
                childAt = view;
            } else if (i == -1) {
                childAt = ch8Var.getPinnedHeader();
            } else {
                childAt = ch8Var.getChildAt(i);
            }
            if ((childAt instanceof gh8) && (childAt.getTag(2131296587) instanceof hh8)) {
                gh8 gh8Var = (gh8) childAt;
                hh8 hh8Var = (hh8) childAt.getTag(2131296587);
                TLRPC.Poll poll = this.s1;
                int size = poll.answers.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i3);
                        if (Arrays.equals(pollAnswer.option, hh8Var.d) && ((fh8) this.v1.get(hh8Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            k47 k47Var = this.r1;
                            if (k47Var != null && k47Var.L2 && (message = k47Var.k) != null && message.translatedPoll != null) {
                                while (true) {
                                    if (i2 >= k47Var.k.translatedPoll.b.size()) {
                                        break;
                                    }
                                    TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) k47Var.k.translatedPoll.b.get(i2);
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
                            gh8Var.a(str, arrayList, E0(hh8Var.d), hh8Var.a, hh8Var.a(), true);
                            gh8Var.setTag(2131296587, hh8Var);
                        } else {
                            i3++;
                        }
                    }
                }
            }
            i++;
        }
        View view2 = ch8Var.q1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(ch8Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ch8Var.getMeasuredHeight(), 0));
            View view3 = ch8Var.q1;
            view3.layout(0, 0, view3.getMeasuredWidth(), ch8Var.q1.getMeasuredHeight());
            ch8Var.invalidate();
        }
        ch8Var.invalidate();
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
            hh8 hh8Var = (hh8) arrayList.get(i);
            if (hh8Var != null) {
                i2 += hh8Var.a;
                if (Arrays.equals(hh8Var.d, bArr)) {
                    i3 += hh8Var.a;
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
            hh8 hh8Var = (hh8) arrayList2.get(i3);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap.put(hh8Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size2) {
                        TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i4);
                        if (Arrays.equals(hh8Var.d, pollAnswerVoters.option)) {
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
            Collections.sort(arrayList, new qx7((byte) 4));
            int min = Math.min(i, arrayList.size());
            for (int i6 = 0; i6 < min; i6++) {
                ((fh8) arrayList.get(i6)).getClass();
            }
        }
    }

    public final void G0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ih8.G0():void");
    }

    @Override
    public final void H() {
        ArrayList arrayList = this.z1;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConnectionsManager.getInstance(this.a).cancelRequest(((Integer) arrayList.get(i)).intValue(), true);
        }
        super.H();
    }

    public final void H0() {
        Paint paint = this.A1;
        if (paint == null) {
            return;
        }
        int w0 = cmb.w0(null, cmb.g5, false);
        int w02 = cmb.w0(null, cmb.h5, false);
        int w03 = gm.w0(w02, w0);
        paint.setColor(w02);
        float L = gm.L(500.0f);
        this.E1 = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{w02, w03, w02}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.B1 = linearGradient;
        paint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.C1 = matrix;
        this.B1.setLocalMatrix(matrix);
    }

    @Override
    public final ArrayList R() {
        ArrayList arrayList = new ArrayList();
        t10 t10Var = new t10(this, (byte) 13);
        arrayList.add(new cnb(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.yj));
        ViewGroup viewGroup = this.b;
        Drawable[] drawableArr = {this.n1};
        int i = cmb.g5;
        arrayList.add(new cnb(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (bnb) null, i));
        arrayList.add(new cnb(this.p1, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.i5));
        ch8 ch8Var = this.l1;
        arrayList.add(new cnb(ch8Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, t10Var, i));
        arrayList.add(new cnb(ch8Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, t10Var, cmb.h5));
        arrayList.add(new cnb(ch8Var, 0, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.p6));
        arrayList.add(new cnb(ch8Var, 0, new Class[]{xib.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.M6));
        return arrayList;
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            int w0 = cmb.w0(null, cmb.h5, false);
            int w02 = cmb.w0(null, cmb.g5, false);
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
            fc4.g(e, true);
        }
    }

    @Override
    public final void z(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.d7));
        hashSet.add(Integer.valueOf(cmb.e7));
    }
}
