package defpackage;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ox1 extends Property {
    public final byte a;
    public final ChatActivityEnterView b;

    public ox1(ChatActivityEnterView chatActivityEnterView, byte b) {
        super(Float.class, "attach_scale");
        this.a = b;
        switch (b) {
            case 1:
                this.b = chatActivityEnterView;
                super(Float.class, "emoji_button_alpha");
                return;
            case 2:
                this.b = chatActivityEnterView;
                super(Float.class, "attach_layout_translation_x");
                return;
            case 3:
                this.b = chatActivityEnterView;
                super(Float.class, "message_text_translation_x");
                return;
            case 4:
                this.b = chatActivityEnterView;
                super(Float.class, "emoji_button_scale");
                return;
            default:
                this.b = chatActivityEnterView;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                View view = (View) obj;
                return Float.valueOf(chatActivityEnterView.F);
            case 1:
                View view2 = (View) obj;
                return Float.valueOf(chatActivityEnterView.n);
            case 2:
                View view3 = (View) obj;
                return Float.valueOf(chatActivityEnterView.y);
            case 3:
                View view4 = (View) obj;
                return Float.valueOf(chatActivityEnterView.H);
            default:
                View view5 = (View) obj;
                return Float.valueOf(chatActivityEnterView.h);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                View view = (View) obj;
                chatActivityEnterView.F = ((Float) obj2).floatValue();
                chatActivityEnterView.l2();
                return;
            case 1:
                View view2 = (View) obj;
                chatActivityEnterView.n = ((Float) obj2).floatValue();
                chatActivityEnterView.q2();
                return;
            case 2:
                View view3 = (View) obj;
                chatActivityEnterView.y = ((Float) obj2).floatValue();
                chatActivityEnterView.l2();
                return;
            case 3:
                View view4 = (View) obj;
                chatActivityEnterView.H = ((Float) obj2).floatValue();
                chatActivityEnterView.u2();
                return;
            default:
                View view5 = (View) obj;
                chatActivityEnterView.h = ((Float) obj2).floatValue();
                chatActivityEnterView.q2();
                return;
        }
    }
}
