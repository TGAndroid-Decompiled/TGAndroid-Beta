package oh;

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
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class i4 {
    public final int f17207a;
    public final ImageReceiver f17208b;
    public int f17209c;
    public boolean d;
    public float f17210e;
    public final org.telegram.ui.Components.z5 f17211f;
    public final org.telegram.ui.Components.z5 f17212g;
    public final org.telegram.ui.Components.z5 h;
    public float f17213i;
    public float f17214j;
    public float f17215k;
    public final boolean f17216l;
    public final RectF f17217m;
    public final RectF f17218n;

    public i4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f17208b = imageReceiver;
        this.f17209c = 0;
        this.d = false;
        this.f17210e = 1.0f;
        pr prVar = pr.h;
        this.f17211f = new org.telegram.ui.Components.z5(profileStoriesView, 420L, prVar);
        this.f17212g = new org.telegram.ui.Components.z5(profileStoriesView, 420L, prVar);
        this.h = new org.telegram.ui.Components.z5(profileStoriesView, 420L, prVar);
        this.f17217m = new RectF();
        this.f17218n = new RectF();
        this.f17207a = storyItem.f21080id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f17216l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f34865x) {
            imageReceiver.onAttachedToWindow();
        }
        q20[] q20VarArr = m7.f17442a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            z8Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, z8Var);
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
