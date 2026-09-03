package dh;

import android.net.Uri;
import android.util.Base64;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class i {
    public final SparseArray f4911a = new SparseArray();

    public static int a(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, TLRPC.InputMedia inputMedia) {
        if (tL_inputMediaPoll.attached_media == inputMedia) {
            return -2;
        }
        if (tL_inputMediaPoll.solution_media == inputMedia) {
            return -3;
        }
        int size = tL_inputMediaPoll.poll.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (tL_inputMediaPoll.poll.answers.get(i10).input_media == inputMedia) {
                return i10;
            }
        }
        return -1;
    }

    public static String c(TLRPC.Message message, int i10) {
        SparseArray<String> sparseArray;
        if (message != null && (sparseArray = message.pollMediaAttachPaths) != null) {
            return sparseArray.get(i10);
        }
        return null;
    }

    public static TLRPC.InputMedia d(TLRPC.TL_inputMediaPoll tL_inputMediaPoll) {
        TLRPC.InputMedia inputMedia = tL_inputMediaPoll.attached_media;
        if (inputMedia != null) {
            return inputMedia;
        }
        TLRPC.InputMedia inputMedia2 = tL_inputMediaPoll.solution_media;
        if (inputMedia2 != null) {
            return inputMedia2;
        }
        int size = tL_inputMediaPoll.poll.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.InputMedia inputMedia3 = tL_inputMediaPoll.poll.answers.get(i10).input_media;
            if (inputMedia3 != null) {
                return inputMedia3;
            }
        }
        return null;
    }

    public static TLRPC.InputMedia e(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, int i10) {
        TLRPC.PollAnswer pollAnswer;
        if (i10 == -2) {
            return tL_inputMediaPoll.attached_media;
        }
        if (i10 == -3) {
            return tL_inputMediaPoll.solution_media;
        }
        if (i10 < 0 || i10 >= tL_inputMediaPoll.poll.answers.size() || (pollAnswer = tL_inputMediaPoll.poll.answers.get(i10)) == null) {
            return null;
        }
        return pollAnswer.input_media;
    }

    public static TLRPC.MessageMedia f(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, int i10) {
        TLRPC.PollAnswer pollAnswer;
        if (i10 == -2) {
            return tL_messageMediaPoll.attached_media;
        }
        if (i10 == -3) {
            return tL_messageMediaPoll.results.solution_media;
        }
        if (i10 < 0 || i10 >= tL_messageMediaPoll.poll.answers.size() || (pollAnswer = tL_messageMediaPoll.poll.answers.get(i10)) == null) {
            return null;
        }
        return pollAnswer.media;
    }

    public static byte[] g(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("option");
            if (queryParameter != null) {
                return Base64.decode(queryParameter, 9);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void i(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, int i10) {
        TLRPC.PollAnswer pollAnswer;
        if (i10 == -2) {
            tL_inputMediaPoll.attached_media = null;
        } else if (i10 == -3) {
            tL_inputMediaPoll.solution_media = null;
        } else if (i10 >= 0 && i10 < tL_inputMediaPoll.poll.answers.size() && (pollAnswer = tL_inputMediaPoll.poll.answers.get(i10)) != null) {
            pollAnswer.input_media = null;
        }
    }

    public static void j(TLRPC.Message message, String str, int i10) {
        if (message == null) {
            return;
        }
        if (message.pollMediaAttachPaths == null) {
            message.pollMediaAttachPaths = new SparseArray<>();
        }
        message.pollMediaAttachPaths.put(i10, str);
    }

    public static void k(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, int i10, TLRPC.InputMedia inputMedia) {
        if (i10 == -2) {
            tL_inputMediaPoll.attached_media = inputMedia;
        } else if (i10 == -3) {
            tL_inputMediaPoll.solution_media = inputMedia;
        } else if (i10 >= 0 && i10 < tL_inputMediaPoll.poll.answers.size()) {
            TLRPC.PollAnswer pollAnswer = tL_inputMediaPoll.poll.answers.get(i10);
            if (pollAnswer instanceof TLRPC.TL_inputPollAnswer) {
                pollAnswer.input_media = inputMedia;
                return;
            }
            TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
            tL_inputPollAnswer.input_media = inputMedia;
            tL_inputPollAnswer.text = pollAnswer.text;
            tL_inputPollAnswer.media = pollAnswer.media;
            tL_inputPollAnswer.option = pollAnswer.option;
            tL_inputMediaPoll.poll.answers.set(i10, tL_inputPollAnswer);
        }
    }

    public static void l(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, int i10, TLRPC.MessageMedia messageMedia) {
        if (i10 == -2) {
            tL_messageMediaPoll.attached_media = messageMedia;
        } else if (i10 == -3) {
            tL_messageMediaPoll.results.solution_media = messageMedia;
        } else if (i10 >= 0 && i10 < tL_messageMediaPoll.poll.answers.size()) {
            TLRPC.PollAnswer pollAnswer = tL_messageMediaPoll.poll.answers.get(i10);
            if (pollAnswer instanceof TLRPC.TL_inputPollAnswer) {
                TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                tL_pollAnswer.text = pollAnswer.text;
                tL_pollAnswer.option = r0;
                byte[] bArr = {(byte) (i10 + 48)};
                tL_pollAnswer.media = messageMedia;
                tL_messageMediaPoll.poll.answers.set(i10, tL_pollAnswer);
                return;
            }
            pollAnswer.media = messageMedia;
            TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
            tL_inputPollAnswer.text = pollAnswer.text;
            tL_inputPollAnswer.media = pollAnswer.media;
            tL_inputPollAnswer.option = pollAnswer.option;
        }
    }

    public final h b(int i10) {
        return (h) this.f4911a.get(i10);
    }

    public final void h(int i10) {
        SparseArray sparseArray = this.f4911a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (sparseArray.keyAt(i11) > i10) {
                if (i10 >= 0) {
                    SparseArray clone = sparseArray.clone();
                    sparseArray.clear();
                    int size2 = clone.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        int keyAt = clone.keyAt(i12);
                        h hVar = (h) clone.valueAt(i12);
                        if (keyAt < i10) {
                            sparseArray.put(keyAt, hVar);
                        }
                        if (keyAt > i10) {
                            sparseArray.put(keyAt - 1, hVar);
                        }
                    }
                    return;
                }
                return;
            }
        }
        sparseArray.remove(i10);
    }
}
