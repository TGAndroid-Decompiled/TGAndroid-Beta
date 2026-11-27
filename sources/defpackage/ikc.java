package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
public final class ikc extends LinearLayout {
    public final mkc a;

    public ikc(mkc mkcVar, Activity activity) {
        super(activity);
        this.a = mkcVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        VoIPServiceState sharedState = VoIPService.getSharedState();
        CharSequence text = this.a.F.getText();
        if (sharedState != null && !TextUtils.isEmpty(text)) {
            StringBuilder sb = new StringBuilder(text);
            sb.append(", ");
            if (sharedState.getPrivateCall() != null && sharedState.getPrivateCall().video) {
                sb.append(ob6.M0(2131742949, null));
            } else {
                sb.append(ob6.M0(2131742952, null));
            }
            long callDuration = sharedState.getCallDuration();
            if (callDuration > 0) {
                sb.append(", ");
                sb.append(ob6.z((int) (callDuration / 1000)));
            }
            accessibilityNodeInfo.setText(sb);
        }
    }
}
