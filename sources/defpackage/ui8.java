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
public final class ui8 extends nx0 {
    public static final qm L1 = new qm("placeholderAlpha", (byte) 9);
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
    public final oi8 l1;
    public final qi8 m1;
    public final Drawable n1;
    public final View o1;
    public final y10 p1;
    public AnimatorSet q1;
    public final r47 r1;
    public final TLRPC.Poll s1;
    public final TLRPC.InputPeer t1;
    public final HashSet u1;
    public final HashMap v1;
    public final ArrayList w1;
    public final gm x1;
    public int y1;
    public final ArrayList z1;

    public ui8(Context context, int i, r47 r47Var, vnb vnbVar) {
        super(1, vnbVar, context, true);
        TLRPC.Message message;
        x4c x4cVar;
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
        this.r1 = r47Var;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) r47Var.k.media;
        this.H1 = tL_messageMediaPoll;
        this.s1 = tL_messageMediaPoll.poll;
        this.t1 = uc7.s1(this.a).j1(r47.B0(r47Var.k));
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
                this.w1.add(new ti8(tL_messages_votesList, pollAnswerVoters.option));
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
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getPollVotes, new eu0(this, numArr, i5, arrayList, pollAnswerVoters, (byte) 10)));
                numArr[i5] = valueOf;
                this.z1.add(valueOf);
            }
            i5++;
            i4 = i2;
        }
        G0();
        Collections.sort(this.w1, new ni8(this));
        I0();
        Drawable mutate = context.getResources().getDrawable(2131232744).mutate();
        this.n1 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.i5, false), PorterDuff.Mode.MULTIPLY));
        gj3 gj3Var = new gj3(this, context);
        this.b = gj3Var;
        gj3Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i9 = this.u0;
        viewGroup.setPadding(i9, 0, i9, 0);
        oi8 oi8Var = new oi8(this, context);
        this.l1 = oi8Var;
        oi8Var.setSections(false);
        zb3 zb3Var = new zb3();
        zb3Var.c = (short) 150;
        zb3Var.e = (short) 350;
        zb3Var.f = (short) 0;
        zb3Var.g = (short) 0;
        zb3Var.d = (short) 0;
        zb3Var.C = false;
        zb3Var.i = new OvershootInterpolator(1.1f);
        zb3Var.o = k43.h;
        oi8Var.setItemAnimator(zb3Var);
        oi8Var.setClipToPadding(false);
        getContext();
        oi8Var.setLayoutManager(new as((byte) 12, i4, false));
        oi8Var.setHorizontalScrollBarEnabled(false);
        oi8Var.setVerticalScrollBarEnabled(false);
        oi8Var.setSectionsType(2);
        this.b.addView(oi8Var, tre.e(-1, -1, 51));
        qi8 qi8Var = new qi8(this, context);
        this.m1 = qi8Var;
        oi8Var.setAdapter(qi8Var);
        yob.l(oi8Var, 21, aob.A5, null);
        oi8Var.setOnItemClickListener(new l0(this, context, (byte) 18));
        oi8Var.setOnScrollListener(new e98(this, (byte) 2));
        gm gmVar = new gm(context);
        this.x1 = gmVar;
        gmVar.setTextSize(1, 18.0f);
        gmVar.setTypeface(hl.o());
        gmVar.setPadding(hl.L(21.0f), hl.L(5.0f), hl.L(14.0f), hl.L(21.0f));
        int i10 = aob.j5;
        yob.X(gmVar, i10, null);
        gmVar.setTag(-33024);
        gmVar.setLayoutParams(new r79(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.s1.question;
        if (tL_textWithEntities2 != null) {
            r47 r47Var2 = this.r1;
            if (r47Var2 != null && r47Var2.L2 && (message = r47Var2.k) != null && (x4cVar = message.translatedPoll) != null && (tL_textWithEntities = x4cVar.a) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            jn7.i(gmVar);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            ls6.h(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder, -1);
            CharSequence m = pv3.m(spannableStringBuilder, gmVar.getPaint().getFontMetricsInt(), false, null, 0);
            r47.A5(m, tL_textWithEntities2.entities, gmVar.getPaint().getFontMetricsInt(), false);
            gmVar.setText(m);
        }
        y10 y10Var = new y10((byte) 4, context, this);
        this.p1 = y10Var;
        yob.h(aob.h5, null, y10Var);
        y10Var.setBackButtonImage(2131231243);
        yob.l(y10Var, 1, i10, null);
        yob.l(y10Var, 3, aob.I5, null);
        yob.l(y10Var, 5, i10, null);
        yob.l(y10Var, 6, aob.Gj, null);
        y10Var.setOccupyStatusBar(false);
        y10Var.setAlpha(0.0f);
        y10Var.setTitle(ob6.M0(2131746888, null));
        boolean z = this.s1.quiz;
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (z) {
            y10Var.setSubtitle(ob6.G(pollResults.total_voters, "Answer", new Object[0]));
        } else {
            y10Var.setSubtitle(ob6.G(pollResults.total_voters, "Vote", new Object[0]));
        }
        this.b.addView(y10Var, tre.c(-2.0f, -1));
        y10Var.setActionBarMenuOnItemClick(new zl5(this, (byte) 24));
        View view = new View(context);
        this.o1 = view;
        view.setAlpha(0.0f);
        yob.h(aob.V5, null, view);
        this.b.addView(view, tre.c(1.0f, -1));
    }

    @Override
    public final void A(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.e7));
        hashSet.add(Integer.valueOf(aob.f7));
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final void E0(View view) {
        oi8 oi8Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i = -2;
        while (true) {
            oi8Var = this.l1;
            int i2 = 0;
            if (i >= oi8Var.getChildCount()) {
                break;
            }
            if (i == -2) {
                childAt = view;
            } else if (i == -1) {
                childAt = oi8Var.getPinnedHeader();
            } else {
                childAt = oi8Var.getChildAt(i);
            }
            if ((childAt instanceof si8) && (childAt.getTag(2131296587) instanceof ti8)) {
                si8 si8Var = (si8) childAt;
                ti8 ti8Var = (ti8) childAt.getTag(2131296587);
                TLRPC.Poll poll = this.s1;
                int size = poll.answers.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i3);
                        if (Arrays.equals(pollAnswer.option, ti8Var.d) && ((ri8) this.v1.get(ti8Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            r47 r47Var = this.r1;
                            if (r47Var != null && r47Var.L2 && (message = r47Var.k) != null && message.translatedPoll != null) {
                                while (true) {
                                    if (i2 >= r47Var.k.translatedPoll.b.size()) {
                                        break;
                                    }
                                    TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) r47Var.k.translatedPoll.b.get(i2);
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
                            si8Var.a(str, arrayList, F0(ti8Var.d), ti8Var.a, ti8Var.a(), true);
                            si8Var.setTag(2131296587, ti8Var);
                        } else {
                            i3++;
                        }
                    }
                }
            }
            i++;
        }
        View view2 = oi8Var.q1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(oi8Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(oi8Var.getMeasuredHeight(), 0));
            View view3 = oi8Var.q1;
            view3.layout(0, 0, view3.getMeasuredWidth(), oi8Var.q1.getMeasuredHeight());
            oi8Var.invalidate();
        }
        oi8Var.invalidate();
    }

    public final int F0(byte[] bArr) {
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
            ti8 ti8Var = (ti8) arrayList.get(i);
            if (ti8Var != null) {
                i2 += ti8Var.a;
                if (Arrays.equals(ti8Var.d, bArr)) {
                    i3 += ti8Var.a;
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

    public final void G0() {
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
            ti8 ti8Var = (ti8) arrayList2.get(i3);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap.put(ti8Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size2) {
                        TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i4);
                        if (Arrays.equals(ti8Var.d, pollAnswerVoters.option)) {
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
            Collections.sort(arrayList, new qq7((byte) 6));
            int min = Math.min(i, arrayList.size());
            for (int i6 = 0; i6 < min; i6++) {
                ((ri8) arrayList.get(i6)).getClass();
            }
        }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui8.H0():void");
    }

    public final void I0() {
        Paint paint = this.A1;
        if (paint == null) {
            return;
        }
        int w0 = aob.w0(null, aob.h5, false);
        int w02 = aob.w0(null, aob.i5, false);
        int w03 = hl.w0(w02, w0);
        paint.setColor(w02);
        float L = hl.L(500.0f);
        this.E1 = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{w02, w03, w02}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.B1 = linearGradient;
        paint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.C1 = matrix;
        this.B1.setLocalMatrix(matrix);
    }

    @Override
    public final ArrayList S() {
        ArrayList arrayList = new ArrayList();
        u00 u00Var = new u00(this, (byte) 13);
        arrayList.add(new apb(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.zj));
        ViewGroup viewGroup = this.b;
        Drawable[] drawableArr = {this.n1};
        int i = aob.h5;
        arrayList.add(new apb(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (zob) null, i));
        arrayList.add(new apb(this.p1, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.j5));
        oi8 oi8Var = this.l1;
        arrayList.add(new apb(oi8Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, u00Var, i));
        arrayList.add(new apb(oi8Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, u00Var, aob.i5));
        arrayList.add(new apb(oi8Var, 0, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.q6));
        arrayList.add(new apb(oi8Var, 0, new Class[]{skb.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.N6));
        return arrayList;
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            int w0 = aob.w0(null, aob.i5, false);
            int w02 = aob.w0(null, aob.h5, false);
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
            I0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
