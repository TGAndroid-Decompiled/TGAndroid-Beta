package ci;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class b7 {
    public int f5254a;
    public String f5255b;
    public TLRPC.Photo f5256c;
    public TLRPC.Document d;

    public static b7 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f5254a = tL_storyAlbum.album_id;
        obj.f5255b = tL_storyAlbum.title;
        obj.f5256c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
