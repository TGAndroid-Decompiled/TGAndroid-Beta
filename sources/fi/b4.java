package fi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class b4 {
    public final int f11760a;
    public final ImageReceiver f11761b;
    public int f11762c;
    public boolean d;
    public float f11763e;
    public final org.telegram.ui.Components.c6 f11764f;
    public final org.telegram.ui.Components.c6 f11765g;
    public final org.telegram.ui.Components.c6 h;
    public float f11766i;
    public float f11767j;
    public float f11768k;
    public final boolean f11769l;
    public final RectF f11770m;
    public final RectF f11771n;

    public b4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f11761b = imageReceiver;
        this.f11762c = 0;
        this.d = false;
        this.f11763e = 1.0f;
        kr krVar = kr.h;
        this.f11764f = new org.telegram.ui.Components.c6(profileStoriesView, 420L, krVar);
        this.f11765g = new org.telegram.ui.Components.c6(profileStoriesView, 420L, krVar);
        this.h = new org.telegram.ui.Components.c6(profileStoriesView, 420L, krVar);
        this.f11770m = new RectF();
        this.f11771n = new RectF();
        this.f11760a = storyItem.f28731id;
        imageReceiver.K0(org.telegram.messenger.g0.L(200.0f));
        imageReceiver.I0(profileStoriesView);
        this.f11769l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f43952y) {
            imageReceiver.Q();
        }
        q10[] q10VarArr = i7.f12109a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject g22 = mp.u1(imageReceiver.d).g2(storyItem.dialogId);
            a9Var.l(g22);
            imageReceiver.j0(g22, a9Var, null);
        } else if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.s0(fc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, ec.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
        } else {
            if (messageMedia != null) {
                photo = messageMedia.photo;
            } else {
                photo = null;
            }
            if (photo != null && (arrayList = photo.sizes) != null) {
                imageReceiver.v0(null, null, fc.i(org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.L(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, ec.m(photo.sizes), 0L, null, storyItem, 0);
            } else {
                imageReceiver.f();
            }
        }
    }
}
