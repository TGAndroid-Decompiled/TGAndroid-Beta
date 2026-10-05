package fi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.yc;
public final class b implements Utilities.Callback2 {
    public final int f9872a;
    public final f f9873b;

    public b(f fVar, int i10) {
        this.f9872a = i10;
        this.f9873b = fVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        int i10;
        switch (this.f9872a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                w61 w61Var = (w61) obj2;
                f fVar = this.f9873b;
                arrayList.add(h61.l(0, fVar.f9889f));
                h61 c10 = h61.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c10.f27098q = true;
                arrayList.add(c10);
                arrayList.add(h61.E(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = fVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(h61.t(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = fVar.h;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = fVar.getMessagesController().getChatFull(chat.f20047id);
                        h61 w10 = h61.w(chat);
                        long j3 = chat.f20047id;
                        w10.d = (int) (j3 ^ (j3 >>> 32));
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
                        w10.f27094m = string;
                        arrayList.add(w10);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f fVar2 = this.f9873b;
                if (tL_error != null) {
                    fVar2.getClass();
                    yc.a0(fVar2).d0(tL_error, false);
                    return;
                }
                u0.d(fVar2, fVar2.f9885a, 0);
                return;
        }
    }
}
