package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class r10 extends TLObject {
    public TLRPC.TL_textWithEntities f17886a;
    public ArrayList f17887b = new ArrayList();
    public TLRPC.TL_textWithEntities f17888c;

    public static r10 a(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        r10 r10Var = new r10();
        r10Var.f17886a = poll.question;
        for (int i10 = 0; i10 < poll.answers.size(); i10++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i10);
            TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
            tL_pollAnswer.text = pollAnswer.text;
            tL_pollAnswer.option = pollAnswer.option;
            r10Var.f17887b.add(tL_pollAnswer);
        }
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !TextUtils.isEmpty(pollResults.solution)) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            r10Var.f17888c = tL_textWithEntities;
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            tL_textWithEntities.text = pollResults2.solution;
            tL_textWithEntities.entities = pollResults2.solution_entities;
        }
        return r10Var;
    }

    public static boolean b(kj kjVar, r10 r10Var) {
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        TLRPC.Poll poll;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        TLRPC.MessageMedia n12 = kj.n1(kjVar);
        if (!(n12 instanceof TLRPC.TL_messageMediaPoll) || (poll = (tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n12).poll) == null) {
            return true;
        }
        if (poll.question != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (r10Var.f17886a != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return false;
        }
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && pollResults.solution != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (r10Var.f17888c != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 == z13 && poll.answers.size() == r10Var.f17887b.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        if ((readInt32 & 1) != 0) {
            this.f17886a = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((readInt32 & 2) != 0) {
            this.f17887b = Vector.deserialize(inputSerializedData, new e9(26), z10);
        }
        if ((readInt32 & 4) != 0) {
            this.f17888c = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i10;
        outputSerializedData.writeInt32(613759672);
        if (this.f17886a != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ArrayList arrayList = this.f17887b;
        if (arrayList != null && !arrayList.isEmpty()) {
            i10 |= 2;
        }
        if (this.f17888c != null) {
            i10 |= 4;
        }
        outputSerializedData.writeInt32(i10);
        if ((i10 & 1) != 0) {
            this.f17886a.serializeToStream(outputSerializedData);
        }
        if ((i10 & 2) != 0) {
            Vector.serialize(outputSerializedData, this.f17887b);
        }
        if ((i10 & 4) != 0) {
            this.f17888c.serializeToStream(outputSerializedData);
        }
    }
}
