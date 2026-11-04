package ei;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.hp;
import org.telegram.messenger.zb;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class l4 {
    public final int f10605a;
    public final ImageReceiver f10606b;
    public int f10607c;
    public boolean d;
    public float f10608e;
    public final org.telegram.ui.Components.u5 f10609f;
    public final org.telegram.ui.Components.u5 f10610g;
    public final org.telegram.ui.Components.u5 h;
    public float f10611i;
    public float f10612j;
    public float f10613k;
    public final boolean f10614l;
    public final RectF f10615m;
    public final RectF f10616n;

    public l4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f10606b = imageReceiver;
        this.f10607c = 0;
        this.d = false;
        this.f10608e = 1.0f;
        xq xqVar = xq.h;
        this.f10609f = new org.telegram.ui.Components.u5(profileStoriesView, 420L, xqVar);
        this.f10610g = new org.telegram.ui.Components.u5(profileStoriesView, 420L, xqVar);
        this.h = new org.telegram.ui.Components.u5(profileStoriesView, 420L, xqVar);
        this.f10615m = new RectF();
        this.f10616n = new RectF();
        this.f10605a = storyItem.f27240id;
        imageReceiver.J0(org.telegram.messenger.g0.L(200.0f));
        imageReceiver.H0(profileStoriesView);
        this.f10614l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f42037y) {
            imageReceiver.P();
        }
        b10[] b10VarArr = s7.f11011a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject e22 = hp.s1(imageReceiver.d).e2(storyItem.dialogId);
            u8Var.l(e22);
            imageReceiver.i0(e22, u8Var, null);
        } else if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.r0(ac.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, zb.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
        } else {
            if (messageMedia != null) {
                photo = messageMedia.photo;
            } else {
                photo = null;
            }
            if (photo != null && (arrayList = photo.sizes) != null) {
                imageReceiver.u0(null, null, ac.i(org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.L(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, zb.m(photo.sizes), 0L, null, storyItem, 0);
            } else {
                imageReceiver.f();
            }
        }
    }
}
