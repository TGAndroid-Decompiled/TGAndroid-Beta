package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ki8 {
    public final TLRPC.TL_messageMediaPoll a;
    public final TLRPC.TL_inputMediaPoll b;
    public final long c;
    public final String d;
    public final ArrayList e;

    public ki8(ih8 ih8Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, long j, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.c = j;
        this.d = str;
        this.e = arrayList;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.id = poll.id;
        tL_poll.flags = poll.flags;
        tL_poll.closed = poll.closed;
        tL_poll.public_voters = poll.public_voters;
        tL_poll.multiple_choice = poll.multiple_choice;
        tL_poll.open_answers = poll.open_answers;
        tL_poll.revoting_disabled = poll.revoting_disabled;
        tL_poll.shuffle_answers = poll.shuffle_answers;
        tL_poll.subscribers_only = poll.subscribers_only;
        tL_poll.countries_iso2 = poll.countries_iso2;
        tL_poll.hide_results_until_close = poll.hide_results_until_close;
        tL_poll.creator = poll.creator;
        tL_poll.quiz = poll.quiz;
        tL_poll.answers = new ArrayList<>(tL_messageMediaPoll.poll.answers);
        ArrayList<TLRPC.PollAnswer> arrayList3 = tL_messageMediaPoll.poll.answers;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            TLRPC.PollAnswer pollAnswer = arrayList3.get(i);
            i++;
            new TLRPC.TL_inputPollAnswer().text = pollAnswer.text;
        }
        TLRPC.Poll poll2 = tL_inputMediaPoll.poll;
        TLRPC.Poll poll3 = tL_messageMediaPoll.poll;
        poll2.question = poll3.question;
        poll2.close_period = poll3.close_period;
        poll2.close_date = poll3.close_date;
        poll2.hash = poll3.hash;
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !TextUtils.isEmpty(pollResults.solution)) {
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            tL_inputMediaPoll.solution = pollResults2.solution;
            tL_inputMediaPoll.solution_entities = pollResults2.solution_entities;
            tL_inputMediaPoll.flags |= 2;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            tL_inputMediaPoll.correct_answers = new ArrayList<>(arrayList2);
            tL_inputMediaPoll.flags |= 1;
        }
        if (ih8Var != null) {
            SparseArray sparseArray = ih8Var.a;
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int keyAt = sparseArray.keyAt(i2);
                zg8 zg8Var = (zg8) sparseArray.valueAt(i2);
                if (zg8Var instanceof eh8) {
                    TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                    tL_inputMediaWebPage.url = ((eh8) zg8Var).b;
                    tL_inputMediaWebPage.optional = true;
                    ih8.k(tL_inputMediaPoll, keyAt, tL_inputMediaWebPage);
                } else if (zg8Var instanceof gh8) {
                    ih8.k(tL_inputMediaPoll, keyAt, atb.h(((gh8) zg8Var).b));
                } else if (zg8Var instanceof jh8) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((jh8) zg8Var).b;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.id = tL_inputDocument;
                    ih8.k(tL_inputMediaPoll, keyAt, tL_inputMediaDocument);
                }
            }
            int size3 = sparseArray.size();
            for (int i3 = 0; i3 < size3; i3++) {
                int keyAt2 = sparseArray.keyAt(i3);
                zg8 zg8Var2 = (zg8) sparseArray.valueAt(i3);
                if (zg8Var2 instanceof eh8) {
                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                    tL_messageMediaWebPage.webpage = tL_webPage;
                    String str2 = ((eh8) zg8Var2).b;
                    tL_webPage.display_url = str2;
                    tL_webPage.url = str2;
                    ih8.l(tL_messageMediaPoll, keyAt2, tL_messageMediaWebPage);
                } else if (zg8Var2 instanceof gh8) {
                    ih8.l(tL_messageMediaPoll, keyAt2, ((gh8) zg8Var2).b);
                } else if (zg8Var2 instanceof jh8) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_messageMediaDocument.document = ((jh8) zg8Var2).b;
                    ih8.l(tL_messageMediaPoll, keyAt2, tL_messageMediaDocument);
                }
            }
        }
        this.a = tL_messageMediaPoll;
        this.b = tL_inputMediaPoll;
    }
}
