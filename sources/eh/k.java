package eh;

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k {
    public final i f5654a;
    public final TLRPC.TL_messageMediaPoll f5655b;
    public final TLRPC.TL_inputMediaPoll f5656c;
    public final long d;
    public final String f5657e;
    public final ArrayList f5658f;

    public k(i iVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, long j10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f5654a = iVar;
        this.d = j10;
        this.f5657e = str;
        this.f5658f = arrayList;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.f20871id = poll.f20871id;
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
        int i10 = 0;
        while (i10 < size) {
            TLRPC.PollAnswer pollAnswer = arrayList3.get(i10);
            i10++;
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
        if (iVar != null) {
            SparseArray sparseArray = iVar.f5638a;
            int size2 = sparseArray.size();
            for (int i11 = 0; i11 < size2; i11++) {
                int keyAt = sparseArray.keyAt(i11);
                h hVar = (h) sparseArray.valueAt(i11);
                if (hVar instanceof fh.e) {
                    TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                    tL_inputMediaWebPage.url = ((fh.e) hVar).f6659b;
                    tL_inputMediaWebPage.optional = true;
                    i.k(tL_inputMediaPoll, keyAt, tL_inputMediaWebPage);
                } else if (hVar instanceof fh.g) {
                    i.k(tL_inputMediaPoll, keyAt, mf.d.h(((fh.g) hVar).f6668b));
                } else if (hVar instanceof fh.i) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((fh.i) hVar).f6671b;
                    tL_inputDocument.f20857id = document.f20851id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.f20906id = tL_inputDocument;
                    i.k(tL_inputMediaPoll, keyAt, tL_inputMediaDocument);
                }
            }
            int size3 = sparseArray.size();
            for (int i12 = 0; i12 < size3; i12++) {
                int keyAt2 = sparseArray.keyAt(i12);
                h hVar2 = (h) sparseArray.valueAt(i12);
                if (hVar2 instanceof fh.e) {
                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                    tL_messageMediaWebPage.webpage = tL_webPage;
                    String str2 = ((fh.e) hVar2).f6659b;
                    tL_webPage.display_url = str2;
                    tL_webPage.url = str2;
                    i.l(tL_messageMediaPoll, keyAt2, tL_messageMediaWebPage);
                } else if (hVar2 instanceof fh.g) {
                    i.l(tL_messageMediaPoll, keyAt2, ((fh.g) hVar2).f6668b);
                } else if (hVar2 instanceof fh.i) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_messageMediaDocument.document = ((fh.i) hVar2).f6671b;
                    i.l(tL_messageMediaPoll, keyAt2, tL_messageMediaDocument);
                }
            }
        }
        this.f5655b = tL_messageMediaPoll;
        this.f5656c = tL_inputMediaPoll;
    }
}
