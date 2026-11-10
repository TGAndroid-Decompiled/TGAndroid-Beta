package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class c10 extends TLObject {
    public TLRPC.TL_textWithEntities f21775a;
    public ArrayList f21776b = new ArrayList();
    public TLRPC.TL_textWithEntities f21777c;

    public static c10 a(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        c10 c10Var = new c10();
        c10Var.f21775a = poll.question;
        for (int i7 = 0; i7 < poll.answers.size(); i7++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i7);
            TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
            tL_pollAnswer.text = pollAnswer.text;
            tL_pollAnswer.option = pollAnswer.option;
            c10Var.f21776b.add(tL_pollAnswer);
        }
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !TextUtils.isEmpty(pollResults.solution)) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            c10Var.f21777c = tL_textWithEntities;
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            tL_textWithEntities.text = pollResults2.solution;
            tL_textWithEntities.entities = pollResults2.solution_entities;
        }
        return c10Var;
    }

    public static boolean b(ij ijVar, c10 c10Var) {
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        TLRPC.Poll poll;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.MessageMedia m12 = ij.m1(ijVar);
        if (!(m12 instanceof TLRPC.TL_messageMediaPoll) || (poll = (tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m12).poll) == null) {
            return true;
        }
        if (poll.question != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (c10Var.f21775a != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 != z10) {
            return false;
        }
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && pollResults.solution != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c10Var.f21777c != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 == z12 && poll.answers.size() == c10Var.f21776b.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        int readInt32 = inputSerializedData.readInt32(z9);
        if ((readInt32 & 1) != 0) {
            this.f21775a = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        }
        if ((readInt32 & 2) != 0) {
            this.f21776b = Vector.deserialize(inputSerializedData, new ch(12), z9);
        }
        if ((readInt32 & 4) != 0) {
            this.f21777c = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i7;
        outputSerializedData.writeInt32(613759672);
        if (this.f21775a != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        ArrayList arrayList = this.f21776b;
        if (arrayList != null && !arrayList.isEmpty()) {
            i7 |= 2;
        }
        if (this.f21777c != null) {
            i7 |= 4;
        }
        outputSerializedData.writeInt32(i7);
        if ((i7 & 1) != 0) {
            this.f21775a.serializeToStream(outputSerializedData);
        }
        if ((i7 & 2) != 0) {
            Vector.serialize(outputSerializedData, this.f21776b);
        }
        if ((i7 & 4) != 0) {
            this.f21777c.serializeToStream(outputSerializedData);
        }
    }
}
