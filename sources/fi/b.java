package fi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zc;
public final class b implements Utilities.Callback2 {
    public final int f9945a;
    public final f f9946b;

    public b(f fVar, int i10) {
        this.f9945a = i10;
        this.f9946b = fVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        int i10;
        switch (this.f9945a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                h71 h71Var = (h71) obj2;
                f fVar = this.f9946b;
                e eVar = fVar.f9962f;
                u61 u61Var = new u61(-4);
                u61Var.d = 0;
                u61Var.f31064c = eVar;
                u61Var.f31084z = -1;
                arrayList.add(u61Var);
                u61 c10 = u61.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c10.f31076q = true;
                arrayList.add(c10);
                arrayList.add(u61.D(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = fVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(u61.s(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = fVar.h;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = fVar.getMessagesController().getChatFull(chat.f19803id);
                        u61 v = u61.v(chat);
                        long j3 = chat.f19803id;
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
                        v.f31072m = string;
                        arrayList.add(v);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f fVar2 = this.f9946b;
                if (tL_error != null) {
                    fVar2.getClass();
                    zc.a0(fVar2).f0(tL_error, false);
                    return;
                }
                u0.d(fVar2, fVar2.f9958a, 0);
                return;
        }
    }
}
