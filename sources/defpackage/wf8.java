package defpackage;

import android.net.Uri;
import android.util.Base64;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class wf8 {
    public final SparseArray a = new SparseArray();

    public static int a(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, TLRPC.InputMedia inputMedia) {
        if (tL_inputMediaPoll.attached_media == inputMedia) {
            return -2;
        }
        if (tL_inputMediaPoll.solution_media == inputMedia) {
            return -3;
        }
        int size = tL_inputMediaPoll.poll.answers.size();
        for (int i = 0; i < size; i++) {
            if (tL_inputMediaPoll.poll.answers.get(i).input_media == inputMedia) {
                return i;
            }
        }
        return -1;
    }

    public static String c(int i, TLRPC.Message message) {
        SparseArray<String> sparseArray;
        if (message != null && (sparseArray = message.pollMediaAttachPaths) != null) {
            return sparseArray.get(i);
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
        for (int i = 0; i < size; i++) {
            TLRPC.InputMedia inputMedia3 = tL_inputMediaPoll.poll.answers.get(i).input_media;
            if (inputMedia3 != null) {
                return inputMedia3;
            }
        }
        return null;
    }

    public static TLRPC.InputMedia e(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, int i) {
        TLRPC.PollAnswer pollAnswer;
        if (i == -2) {
            return tL_inputMediaPoll.attached_media;
        }
        if (i == -3) {
            return tL_inputMediaPoll.solution_media;
        }
        if (i < 0 || i >= tL_inputMediaPoll.poll.answers.size() || (pollAnswer = tL_inputMediaPoll.poll.answers.get(i)) == null) {
            return null;
        }
        return pollAnswer.input_media;
    }

    public static TLRPC.MessageMedia f(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, int i) {
        TLRPC.PollAnswer pollAnswer;
        if (i == -2) {
            return tL_messageMediaPoll.attached_media;
        }
        if (i == -3) {
            return tL_messageMediaPoll.results.solution_media;
        }
        if (i < 0 || i >= tL_messageMediaPoll.poll.answers.size() || (pollAnswer = tL_messageMediaPoll.poll.answers.get(i)) == null) {
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

    public static void i(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, int i) {
        TLRPC.PollAnswer pollAnswer;
        if (i == -2) {
            tL_inputMediaPoll.attached_media = null;
        } else if (i == -3) {
            tL_inputMediaPoll.solution_media = null;
        } else if (i >= 0 && i < tL_inputMediaPoll.poll.answers.size() && (pollAnswer = tL_inputMediaPoll.poll.answers.get(i)) != null) {
            pollAnswer.input_media = null;
        }
    }

    public static void j(TLRPC.Message message, String str, int i) {
        if (message == null) {
            return;
        }
        SparseArray<String> sparseArray = message.pollMediaAttachPaths;
        if (sparseArray == null) {
            sparseArray = new SparseArray<>();
            message.pollMediaAttachPaths = sparseArray;
        }
        sparseArray.put(i, str);
    }

    public static void k(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, int i, TLRPC.InputMedia inputMedia) {
        if (i == -2) {
            tL_inputMediaPoll.attached_media = inputMedia;
        } else if (i == -3) {
            tL_inputMediaPoll.solution_media = inputMedia;
        } else if (i >= 0 && i < tL_inputMediaPoll.poll.answers.size()) {
            TLRPC.PollAnswer pollAnswer = tL_inputMediaPoll.poll.answers.get(i);
            if (pollAnswer instanceof TLRPC.TL_inputPollAnswer) {
                pollAnswer.input_media = inputMedia;
                return;
            }
            TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
            tL_inputPollAnswer.input_media = inputMedia;
            tL_inputPollAnswer.text = pollAnswer.text;
            tL_inputPollAnswer.media = pollAnswer.media;
            tL_inputPollAnswer.option = pollAnswer.option;
            tL_inputMediaPoll.poll.answers.set(i, tL_inputPollAnswer);
        }
    }

    public static void l(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, int i, TLRPC.MessageMedia messageMedia) {
        if (i == -2) {
            tL_messageMediaPoll.attached_media = messageMedia;
        } else if (i == -3) {
            tL_messageMediaPoll.results.solution_media = messageMedia;
        } else if (i >= 0 && i < tL_messageMediaPoll.poll.answers.size()) {
            TLRPC.PollAnswer pollAnswer = tL_messageMediaPoll.poll.answers.get(i);
            if (pollAnswer instanceof TLRPC.TL_inputPollAnswer) {
                TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                tL_pollAnswer.text = pollAnswer.text;
                tL_pollAnswer.option = r0;
                byte[] bArr = {(byte) (i + 48)};
                tL_pollAnswer.media = messageMedia;
                tL_messageMediaPoll.poll.answers.set(i, tL_pollAnswer);
                return;
            }
            pollAnswer.media = messageMedia;
            TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
            tL_inputPollAnswer.text = pollAnswer.text;
            tL_inputPollAnswer.media = pollAnswer.media;
            tL_inputPollAnswer.option = pollAnswer.option;
        }
    }

    public final nf8 b(int i) {
        return (nf8) this.a.get(i);
    }

    public final void h(int i) {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (sparseArray.keyAt(i2) > i) {
                if (i >= 0) {
                    SparseArray clone = sparseArray.clone();
                    sparseArray.clear();
                    int size2 = clone.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        int keyAt = clone.keyAt(i3);
                        nf8 nf8Var = (nf8) clone.valueAt(i3);
                        if (keyAt < i) {
                            sparseArray.put(keyAt, nf8Var);
                        }
                        if (keyAt > i) {
                            sparseArray.put(keyAt - 1, nf8Var);
                        }
                    }
                    return;
                }
                return;
            }
        }
        sparseArray.remove(i);
    }
}
