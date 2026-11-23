package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class v00 extends TLObject {
    public TLRPC.TL_textWithEntities f27409a;
    public ArrayList f27410b = new ArrayList();
    public TLRPC.TL_textWithEntities f27411c;

    public static v00 a(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        v00 v00Var = new v00();
        v00Var.f27409a = poll.question;
        for (int i7 = 0; i7 < poll.answers.size(); i7++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i7);
            TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
            tL_pollAnswer.text = pollAnswer.text;
            tL_pollAnswer.option = pollAnswer.option;
            v00Var.f27410b.add(tL_pollAnswer);
        }
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !TextUtils.isEmpty(pollResults.solution)) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            v00Var.f27411c = tL_textWithEntities;
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            tL_textWithEntities.text = pollResults2.solution;
            tL_textWithEntities.entities = pollResults2.solution_entities;
        }
        return v00Var;
    }

    public static boolean b(fj fjVar, v00 v00Var) {
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        TLRPC.Poll poll;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        TLRPC.MessageMedia m12 = fj.m1(fjVar);
        if (!(m12 instanceof TLRPC.TL_messageMediaPoll) || (poll = (tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m12).poll) == null) {
            return true;
        }
        if (poll.question != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (v00Var.f27409a != null) {
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
        if (v00Var.f27411c != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 == z13 && poll.answers.size() == v00Var.f27410b.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        if ((readInt32 & 1) != 0) {
            this.f27409a = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((readInt32 & 2) != 0) {
            this.f27410b = Vector.deserialize(inputSerializedData, new ed(17), z10);
        }
        if ((readInt32 & 4) != 0) {
            this.f27411c = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i7;
        outputSerializedData.writeInt32(613759672);
        if (this.f27409a != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        ArrayList arrayList = this.f27410b;
        if (arrayList != null && !arrayList.isEmpty()) {
            i7 |= 2;
        }
        if (this.f27411c != null) {
            i7 |= 4;
        }
        outputSerializedData.writeInt32(i7);
        if ((i7 & 1) != 0) {
            this.f27409a.serializeToStream(outputSerializedData);
        }
        if ((i7 & 2) != 0) {
            Vector.serialize(outputSerializedData, this.f27410b);
        }
        if ((i7 & 4) != 0) {
            this.f27411c.serializeToStream(outputSerializedData);
        }
    }
}
