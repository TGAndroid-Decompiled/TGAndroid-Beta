package fi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.r61;
public final class b implements Utilities.Callback2 {
    public final int f9946a;
    public final f f9947b;

    public b(f fVar, int i10) {
        this.f9946a = i10;
        this.f9947b = fVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        int i10;
        switch (this.f9946a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                e71 e71Var = (e71) obj2;
                f fVar = this.f9947b;
                e eVar = fVar.f9963f;
                r61 r61Var = new r61(-4);
                r61Var.d = 0;
                r61Var.f30354c = eVar;
                r61Var.f30374z = -1;
                arrayList.add(r61Var);
                r61 c10 = r61.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c10.f30366q = true;
                arrayList.add(c10);
                arrayList.add(r61.D(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = fVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(r61.s(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = fVar.h;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = fVar.getMessagesController().getChatFull(chat.f20032id);
                        r61 v = r61.v(chat);
                        long j3 = chat.f20032id;
                        v.d = (int) (j3 ^ (j3 >>> 32));
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
                        v.f30362m = string;
                        arrayList.add(v);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f fVar2 = this.f9947b;
                if (tL_error != null) {
                    fVar2.getClass();
                    ad.a0(fVar2).f0(tL_error, false);
                    return;
                }
                u0.d(fVar2, fVar2.f9959a, 0);
                return;
        }
    }
}
