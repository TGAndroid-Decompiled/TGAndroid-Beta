package nh;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stories;
public abstract class f8 {
    public static void a(TL_stories.StoryItem storyItem, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 1) {
            new e8(storyItem).readParams(nativeByteBuffer, true);
            return;
        }
        throw new RuntimeException(kh.a2.j(readInt32, "(story) can't read params version = "));
    }

    public static NativeByteBuffer b(TL_stories.StoryItem storyItem) {
        if (storyItem.detectedLng == null && storyItem.translatedLng == null && !storyItem.translated && storyItem.translatedText == null) {
            return null;
        }
        e8 e8Var = new e8(storyItem);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(e8Var.getObjectSize());
            e8Var.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
