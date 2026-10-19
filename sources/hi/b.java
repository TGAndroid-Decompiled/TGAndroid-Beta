package hi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.xc;
public final class b implements Utilities.Callback2 {
    public final int f12131a;
    public final f f12132b;

    public b(f fVar, int i10) {
        this.f12131a = i10;
        this.f12132b = fVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        int i10;
        switch (this.f12131a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                t61 t61Var = (t61) obj2;
                f fVar = this.f12132b;
                e eVar = fVar.f12146f;
                g61 g61Var = new g61(-4);
                g61Var.d = 0;
                g61Var.f26493c = eVar;
                g61Var.f26512z = -1;
                arrayList.add(g61Var);
                g61 c10 = g61.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c10.f26504q = true;
                arrayList.add(c10);
                arrayList.add(g61.D(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = fVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(g61.s(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = fVar.h;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = fVar.getMessagesController().getChatFull(chat.f20275id);
                        g61 v = g61.v(chat);
                        long j10 = chat.f20275id;
                        v.d = (int) (j10 ^ (j10 >>> 32));
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
                        v.f26500m = string;
                        arrayList.add(v);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f fVar2 = this.f12132b;
                if (tL_error != null) {
                    fVar2.getClass();
                    xc.a0(fVar2).f0(tL_error, false);
                    return;
                }
                t0.d(fVar2, fVar2.f12143a, 0);
                return;
        }
    }
}
