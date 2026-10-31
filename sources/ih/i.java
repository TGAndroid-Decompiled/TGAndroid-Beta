package ih;

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i {
    public final TLRPC.TL_messageMediaPoll f8555a;
    public final TLRPC.TL_inputMediaPoll f8556b;
    public final long f8557c;
    public final String d;
    public final ArrayList e;

    public i(g gVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, long j10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f8557c = j10;
        this.d = str;
        this.e = arrayList;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.f19819id = poll.f19819id;
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
        if (gVar != null) {
            SparseArray sparseArray = gVar.f8537a;
            int size2 = sparseArray.size();
            for (int i11 = 0; i11 < size2; i11++) {
                int keyAt = sparseArray.keyAt(i11);
                f fVar = (f) sparseArray.valueAt(i11);
                if (fVar instanceof jh.e) {
                    TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                    tL_inputMediaWebPage.url = ((jh.e) fVar).f10405b;
                    tL_inputMediaWebPage.optional = true;
                    g.k(tL_inputMediaPoll, keyAt, tL_inputMediaWebPage);
                } else if (fVar instanceof jh.h) {
                    g.k(tL_inputMediaPoll, keyAt, sf.d.h(((jh.h) fVar).f10416b));
                } else if (fVar instanceof jh.j) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((jh.j) fVar).f10419b;
                    tL_inputDocument.f19805id = document.f19799id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.f19854id = tL_inputDocument;
                    g.k(tL_inputMediaPoll, keyAt, tL_inputMediaDocument);
                }
            }
            int size3 = sparseArray.size();
            for (int i12 = 0; i12 < size3; i12++) {
                int keyAt2 = sparseArray.keyAt(i12);
                f fVar2 = (f) sparseArray.valueAt(i12);
                if (fVar2 instanceof jh.e) {
                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                    tL_messageMediaWebPage.webpage = tL_webPage;
                    String str2 = ((jh.e) fVar2).f10405b;
                    tL_webPage.display_url = str2;
                    tL_webPage.url = str2;
                    g.l(tL_messageMediaPoll, keyAt2, tL_messageMediaWebPage);
                } else if (fVar2 instanceof jh.h) {
                    g.l(tL_messageMediaPoll, keyAt2, ((jh.h) fVar2).f10416b);
                } else if (fVar2 instanceof jh.j) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_messageMediaDocument.document = ((jh.j) fVar2).f10419b;
                    g.l(tL_messageMediaPoll, keyAt2, tL_messageMediaDocument);
                }
            }
        }
        this.f8555a = tL_messageMediaPoll;
        this.f8556b = tL_inputMediaPoll;
    }
}
