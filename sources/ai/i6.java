package ai;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class i6 {
    public final int f984a;
    public final ImageReceiver f985b;
    public int f986c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.c6 f987f;
    public final org.telegram.ui.Components.c6 f988g;
    public final org.telegram.ui.Components.c6 h;
    public float f989i;
    public float f990j;
    public float f991k;
    public final boolean f992l;
    public final RectF f993m;
    public final RectF f994n;

    public i6(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.f6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f985b = imageReceiver;
        this.f986c = 0;
        this.d = false;
        this.e = 1.0f;
        qr qrVar = qr.h;
        this.f987f = new org.telegram.ui.Components.c6(profileStoriesView, 420L, qrVar);
        this.f988g = new org.telegram.ui.Components.c6(profileStoriesView, 420L, qrVar);
        this.h = new org.telegram.ui.Components.c6(profileStoriesView, 420L, qrVar);
        this.f993m = new RectF();
        this.f994n = new RectF();
        this.f984a = storyItem.f18356id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f992l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f31561x) {
            imageReceiver.onAttachedToWindow();
        }
        o20[] o20VarArr = ia.f1015a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            f9Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, f9Var);
        } else if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
        } else {
            if (messageMedia != null) {
                photo = messageMedia.photo;
            } else {
                photo = null;
            }
            if (photo != null && (arrayList = photo.sizes) != null) {
                imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            } else {
                imageReceiver.clearImage();
            }
        }
    }
}
