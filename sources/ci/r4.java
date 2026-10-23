package ci;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.x20;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class r4 {
    public final int f5857a;
    public final ImageReceiver f5858b;
    public int f5859c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.f6 f5860f;
    public final org.telegram.ui.Components.f6 f5861g;
    public final org.telegram.ui.Components.f6 h;
    public float f5862i;
    public float f5863j;
    public float f5864k;
    public final boolean f5865l;
    public final RectF f5866m;
    public final RectF f5867n;

    public r4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f5858b = imageReceiver;
        this.f5859c = 0;
        this.d = false;
        this.e = 1.0f;
        bs bsVar = bs.h;
        this.f5860f = new org.telegram.ui.Components.f6(profileStoriesView, 420L, bsVar);
        this.f5861g = new org.telegram.ui.Components.f6(profileStoriesView, 420L, bsVar);
        this.h = new org.telegram.ui.Components.f6(profileStoriesView, 420L, bsVar);
        this.f5866m = new RectF();
        this.f5867n = new RectF();
        this.f5857a = storyItem.f20577id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f5865l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f34193x) {
            imageReceiver.onAttachedToWindow();
        }
        x20[] x20VarArr = c8.f5225a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            h9Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, h9Var);
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
