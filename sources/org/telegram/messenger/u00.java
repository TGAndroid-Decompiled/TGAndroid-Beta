package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class u00 extends TLObject {
    public TLRPC.TL_textWithEntities f25638a;
    public ArrayList f25639b = new ArrayList();
    public TLRPC.TL_textWithEntities f25640c;

    public static u00 a(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        u00 u00Var = new u00();
        u00Var.f25638a = poll.question;
        for (int i3 = 0; i3 < poll.answers.size(); i3++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i3);
            TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
            tL_pollAnswer.text = pollAnswer.text;
            tL_pollAnswer.option = pollAnswer.option;
            u00Var.f25639b.add(tL_pollAnswer);
        }
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !TextUtils.isEmpty(pollResults.solution)) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            u00Var.f25640c = tL_textWithEntities;
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            tL_textWithEntities.text = pollResults2.solution;
            tL_textWithEntities.entities = pollResults2.solution_entities;
        }
        return u00Var;
    }

    public static boolean b(zi ziVar, u00 u00Var) {
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        TLRPC.Poll poll;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        TLRPC.MessageMedia n12 = zi.n1(ziVar);
        if (!(n12 instanceof TLRPC.TL_messageMediaPoll) || (poll = (tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n12).poll) == null) {
            return true;
        }
        if (poll.question != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (u00Var.f25638a != null) {
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
        if (u00Var.f25640c != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 == z13 && poll.answers.size() == u00Var.f25639b.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        if ((readInt32 & 1) != 0) {
            this.f25638a = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((readInt32 & 2) != 0) {
            this.f25639b = Vector.deserialize(inputSerializedData, new go(9), z10);
        }
        if ((readInt32 & 4) != 0) {
            this.f25640c = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i3;
        outputSerializedData.writeInt32(613759672);
        if (this.f25638a != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        ArrayList arrayList = this.f25639b;
        if (arrayList != null && !arrayList.isEmpty()) {
            i3 |= 2;
        }
        if (this.f25640c != null) {
            i3 |= 4;
        }
        outputSerializedData.writeInt32(i3);
        if ((i3 & 1) != 0) {
            this.f25638a.serializeToStream(outputSerializedData);
        }
        if ((i3 & 2) != 0) {
            Vector.serialize(outputSerializedData, this.f25639b);
        }
        if ((i3 & 4) != 0) {
            this.f25640c.serializeToStream(outputSerializedData);
        }
    }
}
