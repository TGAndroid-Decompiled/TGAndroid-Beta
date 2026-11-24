package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class cg8 extends c6 {
    public final kg8 a;

    public cg8(kg8 kg8Var) {
        this.a = kg8Var;
    }

    @Override
    public final void b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        kg8 kg8Var = this.a;
        boolean[] zArr = kg8Var.x;
        CharSequence[] charSequenceArr = kg8Var.w;
        yv1 yv1Var = kg8Var.f;
        if (i == -1) {
            if (kg8Var.j0(true)) {
                kg8Var.finishFragment();
            }
        } else if (i == 1) {
            int i9 = 0;
            if (kg8Var.e0) {
                CharSequence[] charSequenceArr2 = {v72.Y(kg8Var.F)};
                i6 = ((d) kg8Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> Y = hs6.d0(i6).Y(charSequenceArr2, true, true);
                CharSequence charSequence = charSequenceArr2[0];
                int size = Y.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.MessageEntity messageEntity = Y.get(i10);
                    if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                        messageEntity.length = charSequence.length() - messageEntity.offset;
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                todoList.others_can_append = kg8Var.I;
                todoList.others_can_complete = kg8Var.K;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = Y;
                if (kg8Var.r != null) {
                    int i11 = 0;
                    i7 = 0;
                    while (true) {
                        int[] iArr = kg8Var.r;
                        if (i11 >= iArr.length) {
                            break;
                        }
                        i7 = Math.max(i7, iArr[i11]);
                        i11++;
                    }
                } else {
                    i7 = 0;
                }
                for (int i12 = 0; i12 < charSequenceArr.length; i12++) {
                    if (!TextUtils.isEmpty(v72.Y(charSequenceArr[i12]))) {
                        CharSequence[] charSequenceArr3 = {v72.Y(charSequenceArr[i12])};
                        i8 = ((d) kg8Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> Y2 = hs6.d0(i8).Y(charSequenceArr3, true, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        int size2 = Y2.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            TLRPC.MessageEntity messageEntity2 = Y2.get(i13);
                            if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                            }
                        }
                        TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        todoItem.title = tL_textWithEntities;
                        tL_textWithEntities.text = charSequence2.toString();
                        todoItem.title.entities = Y2;
                        int[] iArr2 = kg8Var.r;
                        if (iArr2 != null && i12 < iArr2.length) {
                            todoItem.id = iArr2[i12];
                        } else {
                            i7++;
                            todoItem.id = i7;
                        }
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                if (yv1Var.X7()) {
                    ik.I(yv1Var.getParentActivity(), yv1Var.a(), new cz6(this, tL_messageMediaToDo, (byte) 22));
                    return;
                }
                kg8Var.f0.c(tL_messageMediaToDo);
                kg8Var.finishFragment();
            } else if (!kg8Var.M || kg8Var.a.getAlpha() == 1.0f) {
                CharSequence[] charSequenceArr4 = {v72.Y(kg8Var.F)};
                i2 = ((d) kg8Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> Y3 = hs6.d0(i2).Y(charSequenceArr4, true, true);
                CharSequence charSequence3 = charSequenceArr4[0];
                int size3 = Y3.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    TLRPC.MessageEntity messageEntity3 = Y3.get(i14);
                    if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                        messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                    }
                }
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_messageMediaPoll.poll = tL_poll;
                tL_poll.multiple_choice = kg8Var.L;
                tL_poll.quiz = kg8Var.M;
                tL_poll.public_voters = !kg8Var.H;
                tL_poll.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = Y3;
                ArrayList arrayList = new ArrayList(kg8Var.n);
                int i15 = 0;
                while (i15 < charSequenceArr.length) {
                    if (TextUtils.isEmpty(v72.Y(charSequenceArr[i15]))) {
                        i5 = i9;
                    } else {
                        CharSequence[] charSequenceArr5 = new CharSequence[1];
                        charSequenceArr5[i9] = v72.Y(charSequenceArr[i15]);
                        i4 = ((d) kg8Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> Y4 = hs6.d0(i4).Y(charSequenceArr5, true, true);
                        CharSequence charSequence4 = charSequenceArr5[i9];
                        int size4 = Y4.size();
                        int i16 = i9;
                        while (i16 < size4) {
                            TLRPC.MessageEntity messageEntity4 = Y4.get(i16);
                            int i17 = i9;
                            if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                            }
                            i16++;
                            i9 = i17;
                        }
                        i5 = i9;
                        TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                        tL_pollAnswer.text = tL_textWithEntities2;
                        tL_textWithEntities2.text = charSequence4.toString();
                        tL_pollAnswer.text.entities = Y4;
                        byte[] bArr = new byte[1];
                        tL_pollAnswer.option = bArr;
                        bArr[i5] = (byte) (tL_messageMediaPoll.poll.answers.size() + 48);
                        if ((kg8Var.L || kg8Var.M) && zArr[i15]) {
                            arrayList.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i15++;
                    i9 = i5;
                }
                int i18 = i9;
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence Y5 = v72.Y(kg8Var.G);
                if (Y5 != null) {
                    tL_messageMediaPoll.results.solution = Y5.toString();
                    CharSequence[] charSequenceArr6 = new CharSequence[1];
                    charSequenceArr6[i18] = Y5;
                    i3 = ((d) kg8Var).currentAccount;
                    ArrayList<TLRPC.MessageEntity> Y6 = hs6.d0(i3).Y(charSequenceArr6, true, true);
                    if (Y6 != null && !Y6.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = Y6;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                if (yv1Var.X7()) {
                    ik.I(yv1Var.getParentActivity(), yv1Var.a(), new cz6(this, tL_messageMediaPoll, arrayList));
                    return;
                }
                kg8Var.f0.c(tL_messageMediaPoll);
                kg8Var.finishFragment();
            } else {
                int i19 = 0;
                while (i9 < zArr.length) {
                    if (!TextUtils.isEmpty(v72.Y(charSequenceArr[i9])) && zArr[i9]) {
                        i19++;
                    }
                    i9++;
                }
                if (i19 <= 0) {
                    for (int i20 = kg8Var.o0; i20 < kg8Var.o0 + kg8Var.E; i20++) {
                        u69 K = kg8Var.c.K(i20);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof ng8) {
                                ng8 ng8Var = (ng8) view;
                                if (ng8Var.getTop() > gm.L(40.0f)) {
                                    kg8Var.h.c(ng8Var.getCheckBox());
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
        }
    }
}
