package ii;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wc;
public final class b implements Utilities.Callback2 {
    public final int f14326a;
    public final f f14327b;

    public b(f fVar, int i10) {
        this.f14326a = i10;
        this.f14327b = fVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        int i10;
        switch (this.f14326a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                j71 j71Var = (j71) obj2;
                f fVar = this.f14327b;
                arrayList.add(t61.l(0, fVar.h));
                t61 c10 = t61.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c10.f32880q = true;
                arrayList.add(c10);
                arrayList.add(t61.E(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = fVar.f14342n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(t61.t(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = fVar.f14342n;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = fVar.getMessagesController().getChatFull(chat.f22027id);
                        t61 w10 = t61.w(chat);
                        long j10 = chat.f22027id;
                        w10.d = (int) (j10 ^ (j10 >>> 32));
                        if (chatFull != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = chatFull.linked_peers;
                            if (arrayList4 != null) {
                                i10 = arrayList4.size();
                            } else {
                                i10 = 0;
                            }
                            string = LocaleController.formatPluralString("Chats", i10, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.Loading);
                        }
                        w10.f32876m = string;
                        arrayList.add(w10);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f fVar2 = this.f14327b;
                if (tL_error != null) {
                    fVar2.getClass();
                    wc.b0(fVar2).g0(tL_error, false);
                    return;
                }
                s0.d(fVar2, fVar2.f14339b, 0);
                return;
        }
    }
}
