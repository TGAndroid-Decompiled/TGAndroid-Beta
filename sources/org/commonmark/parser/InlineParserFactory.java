package org.commonmark.parser;

import com.stripe.android.Stripe;

public interface InlineParserFactory {
    InlineParser create(Stripe stripe);
}
