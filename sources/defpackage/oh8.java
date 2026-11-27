package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class oh8 extends d6 {
    public final wh8 a;

    public oh8(wh8 wh8Var) {
        this.a = wh8Var;
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
        wh8 wh8Var = this.a;
        boolean[] zArr = wh8Var.x;
        CharSequence[] charSequenceArr = wh8Var.w;
        zu1 zu1Var = wh8Var.f;
        if (i == -1) {
            if (wh8Var.i0(true)) {
                wh8Var.finishFragment();
            }
        } else if (i == 1) {
            int i9 = 0;
            if (wh8Var.e0) {
                CharSequence[] charSequenceArr2 = {a72.X(wh8Var.F)};
                i6 = ((e) wh8Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> Y = ls6.d0(i6).Y(charSequenceArr2, true, true);
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
                todoList.others_can_append = wh8Var.I;
                todoList.others_can_complete = wh8Var.K;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = Y;
                if (wh8Var.r != null) {
                    int i11 = 0;
                    i7 = 0;
                    while (true) {
                        int[] iArr = wh8Var.r;
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
                    if (!TextUtils.isEmpty(a72.X(charSequenceArr[i12]))) {
                        CharSequence[] charSequenceArr3 = {a72.X(charSequenceArr[i12])};
                        i8 = ((e) wh8Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> Y2 = ls6.d0(i8).Y(charSequenceArr3, true, true);
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
                        int[] iArr2 = wh8Var.r;
                        if (iArr2 != null && i12 < iArr2.length) {
                            todoItem.id = iArr2[i12];
                        } else {
                            i7++;
                            todoItem.id = i7;
                        }
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                if (zu1Var.X7()) {
                    jj.I(zu1Var.getParentActivity(), zu1Var.a(), new m88(this, tL_messageMediaToDo, (byte) 6));
                    return;
                }
                wh8Var.f0.a(tL_messageMediaToDo);
                wh8Var.finishFragment();
            } else if (!wh8Var.M || wh8Var.a.getAlpha() == 1.0f) {
                CharSequence[] charSequenceArr4 = {a72.X(wh8Var.F)};
                i2 = ((e) wh8Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> Y3 = ls6.d0(i2).Y(charSequenceArr4, true, true);
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
                tL_poll.multiple_choice = wh8Var.L;
                tL_poll.quiz = wh8Var.M;
                tL_poll.public_voters = !wh8Var.H;
                tL_poll.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = Y3;
                ArrayList arrayList = new ArrayList(wh8Var.n);
                int i15 = 0;
                while (i15 < charSequenceArr.length) {
                    if (TextUtils.isEmpty(a72.X(charSequenceArr[i15]))) {
                        i5 = i9;
                    } else {
                        CharSequence[] charSequenceArr5 = new CharSequence[1];
                        charSequenceArr5[i9] = a72.X(charSequenceArr[i15]);
                        i4 = ((e) wh8Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> Y4 = ls6.d0(i4).Y(charSequenceArr5, true, true);
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
                        if ((wh8Var.L || wh8Var.M) && zArr[i15]) {
                            arrayList.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i15++;
                    i9 = i5;
                }
                int i18 = i9;
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence X = a72.X(wh8Var.G);
                if (X != null) {
                    tL_messageMediaPoll.results.solution = X.toString();
                    CharSequence[] charSequenceArr6 = new CharSequence[1];
                    charSequenceArr6[i18] = X;
                    i3 = ((e) wh8Var).currentAccount;
                    ArrayList<TLRPC.MessageEntity> Y5 = ls6.d0(i3).Y(charSequenceArr6, true, true);
                    if (Y5 != null && !Y5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = Y5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                if (zu1Var.X7()) {
                    jj.I(zu1Var.getParentActivity(), zu1Var.a(), new m88(this, tL_messageMediaPoll, arrayList));
                    return;
                }
                wh8Var.f0.a(tL_messageMediaPoll);
                wh8Var.finishFragment();
            } else {
                int i19 = 0;
                while (i9 < zArr.length) {
                    if (!TextUtils.isEmpty(a72.X(charSequenceArr[i9])) && zArr[i9]) {
                        i19++;
                    }
                    i9++;
                }
                if (i19 <= 0) {
                    for (int i20 = wh8Var.o0; i20 < wh8Var.o0 + wh8Var.E; i20++) {
                        f89 L = wh8Var.c.L(i20);
                        if (L != null) {
                            View view = L.a;
                            if (view instanceof zh8) {
                                zh8 zh8Var = (zh8) view;
                                if (zh8Var.getTop() > hl.L(40.0f)) {
                                    wh8Var.h.c(zh8Var.getCheckBox());
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
